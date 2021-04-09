/*Для сортировки последовательности чисел широко используется быстрая сортировка — QuickSort.
 Далее приведена программа, которая сортирует массив , используя этот алгоритм.

var a : array [1..N] of integer;

procedure QSort(left, right : integer);
var i, j, key, buf : integer;
begin
    key := a[(left + right) div 2];
    i := left;
    j := right;
    repeat
        while a[i] < key do
            inc(i);
        while key < a[j] do
            dec(j);
        if i <= j then begin
            buf := a[i];
            a[i] := a[j];
            a[j] := buf;
            inc(i);
            dec(j);
        end;
    until i > j;
    if left < j then QSort(left, j);
    if i < right then QSort(i, right);
end;
begin
    ...
    QSort(1, N);
end.
Хотя QuickSort является очень быстрой сортировкой в среднем, существуют тесты, на которых она работает очень долго.
Оценивать время работы алгоритма будем числом сравнений с элементами массива
(то есть, суммарным числом сравнений в первом и втором while).
Требуется написать программу, генерирующую тест, на котором быстрая сортировка сделает наибольшее число таких сравнений.

Формат входного файла
В первой строке находится единственное число  .

Формат выходного файла
Вывести перестановку чисел от 1 до , на которой быстрая сортировка выполнит максимальное число сравнений.
 Если таких перестановок несколько, вывести любую из них.*/
import mooc.EdxIO;

import java.util.Random;


public class Task8 {
    public static void main(String[] args) {
        EdxIO io = EdxIO.create();
        //размер массива
        int Size = io.nextInt();    
        //создание массива с исходными данными
        int[] Array = new int[Size];
        for (int i = 0; i < Size; i++) {
            Array[i] = io.nextInt();
        }
    n=Size;
        a=Array;
        QSort(0, (Size-1));
//QuickSort(Array, 0, Size - 1);
        StringBuilder ArrayString = new StringBuilder();
        for (int i = 0; i < Size; i++) {
            ArrayString.append(a[i]).append(" ");}
        io.println(ArrayString.append(" ").append(count));
        io.close();
    }

    static void swapInt(int []c, int a, int b) {
        if(a!=b){
            int TempInt = c[a];
            c[a] = c[b];
            c[b]= TempInt;}
         }

    private static int split(int[] a, int L, int R, int x){
        int j = L;
        for(int i=L; i<=R;i++){
            if (a[i]<x){
                swapInt(a,i,j);
                j=j+1;
            }
        }
        return j;
    }

    protected static Random RandomIndex = new Random();

    protected static int[] QuickSort(int[] a, int L, int R){
    if (R == L){return a;}
        int x = L+RandomIndex.nextInt(R-L);
        int m = split(a,L,R,a[x]);
        QuickSort(a,L,m-1);
        QuickSort(a,m,R);
        return a;
    }

    protected static int count=0;
protected static int n;
protected static int [] a = new int[n];
protected static void QSort(int left, int right) {
    int i, j, key, buf;
    key = a[((left+right)/2)];
    i = left;
    j = right;
    while(i<=j) {
        while (a[i] < key) {
            i++;
            count++;}
        while (key < a[j]) {
            j--;
            count++;}
            if (i <= j) {
                buf = a[i];
                a[i] = a[j];
                a[j] = buf;
                i++;
                j--;
                count++;
            }
        }
        if (left < j) {
            QSort(left, j);
        }
        if (i < right) {
            QSort(i, right);
        }
    }
}

  /*    x  //метод сортировки слиянием
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
        }*/



