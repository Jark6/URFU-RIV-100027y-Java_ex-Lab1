/*Инверсией в последовательности чисел A называется такая ситуация, когда , а .

Дан массив целых чисел. Ваша задача — подсчитать число инверсий в нем.

Подсказка: чтобы сделать это быстрее, можно воспользоваться модификацией сортировки слиянием.

Формат входного файла
В первой строке входного файла содержится число   — число элементов в массиве.
Во второй строке находятся  целых чисел, по модулю не превосходящих .

Формат выходного файла
В выходной файл надо вывести число инверсий в массиве.*/
import mooc.*;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        EdxIO io = EdxIO.create();
        //размер массива
        int Size = io.nextInt();
        //создание массива с исходными данными
        int[] Array = new int[Size];
        for (int i = 0; i < Size; i++) {
            Array[i] = io.nextInt();
        }

        Array = Sort(Array, 1, Size);
/*        StringBuilder ArrayString = new StringBuilder();
        for (int i = 0; i < Size; i++) {
            ArrayString.append(Array[i]).append(" ");
        }*/
        io.println(inversion);
        io.close();
    }
    private static long inversion = 0;

        //метод сортировки слиянием
        private static int[] Merge(int[] a, int[] b, int L, int R) {

            int i = 0, j = 0, k = 0;
            int n = a.length;
            int m = b.length;
            int[] c = new int[(n + m)];
            while (i < n || j < m) {
                if (j == m || (i < n && a[i] <= b[j])) {
                    c[k] = a[i];
                    i++;
                    k++;
                    inversion += k - i;
                } else {
                    c[k] = b[j];
                    j++;
                    k++;
                }
            }

            String log = new StringBuilder().append(L).append(" ").append(R).append(" ").append(c[0]).append(" ").append(c[c.length - 1]).toString();
            return c;
        }

        public static int[] Sort(int[] c, int left, int right) {
            if (c.length <= 1) {
                return c;
            }
            int leftSize = c.length / 2;
            int l2 = left + leftSize - 1;
            int r1 = left + leftSize;
            int[] leftArray = Arrays.copyOf(c, leftSize);
            int[] rightArray = Arrays.copyOfRange(c, leftSize, c.length);
            leftArray = Sort(leftArray, left, l2);
            rightArray = Sort(rightArray, r1, right);
            c = Merge(leftArray, rightArray, left, right);
            return c;
        }
    }


