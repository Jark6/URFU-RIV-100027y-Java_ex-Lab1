/*Дан массив целых чисел. Ваша задача — отсортировать его в порядке неубывания с помощью сортировки слиянием.

Чтобы убедиться, что Вы действительно используете сортировку слиянием, мы просим Вас,
после каждого осуществленного слияния (то есть, когда соответствующий подмассив уже отсортирован!),
выводить индексы граничных элементов и их значения.

Формат входного файла
В первой строке входного файла содержится число   — число элементов в массиве.
Во второй строке находятся  целых чисел, по модулю не превосходящих .*/
package Task6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;

class Sort {
    static class SortMerge{
        PrintWriter pw;

        {
            try {
                pw = new PrintWriter(new FileWriter("output.txt"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void Print(String S) {
            pw.println(S);
                    }
//метод сортировки слиянием
        private int[] Merge(int[] a, int[] b, int L, int R) {

            int i = 0, j = 0, k = 0;
            int n = a.length;
            int m = b.length;
            int[] c = new int[(n + m)];
            while (i < n || j < m) {
                if (j == m || (i < n && a[i] <= b[j])) {
                    c[k] = a[i];
                    i++;
                    k++;
                } else {
                    c[k] = b[j];
                    j++;
                    k++;
                }
            }

                Print(L+" "+R+" "+c[0]+" "+c[c.length-1]);
                return c;
        }

        public int [] Sort(int[] c, int left, int right) {
                if (c.length <= 1) {
                return c;
            }
            int leftSize = c.length / 2;
                int l2 = left+leftSize-1;
                int r1 = left+leftSize;
            int[] leftArray = Arrays.copyOf(c, leftSize);
            int[] rightArray = Arrays.copyOfRange(c, leftSize, c.length);
            leftArray=Sort(leftArray, left, l2);
            rightArray=Sort(rightArray, r1, right);
            c = Merge(leftArray, rightArray, left, right);
            return c;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("input.txt"));
        /*PrintWriter out = new PrintWriter(new FileWriter("src\\Task6\\output.txt"));*/
        //размер массива
        int Size = in.nextInt();
        //создание массива с исходными данными
        int[] Array = new int[Size];
        for (int i = 0; i < Size; i++) {
            Array[i] = in.nextInt();
        }
        SortMerge SortArray = new SortMerge();
        Array = SortArray.Sort(Array, 1, Size);
        StringBuilder ArrayString = new StringBuilder();
        for (int i=0;i<Size;i++){
            ArrayString.append(Array[i]).append(" ");
        }
        SortArray.Print(ArrayString.toString());
        SortArray.pw.flush();
    }
}
