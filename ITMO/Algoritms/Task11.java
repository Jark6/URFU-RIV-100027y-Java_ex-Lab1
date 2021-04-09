/*В этой задаче Вам нужно будет отсортировать много неотрицательных целых чисел.

Вам даны два массива,  и , содержащие соответственно  и  элементов.
Числа, которые нужно будет отсортировать, имеют вид , где  и .
Иными словами, каждый элемент первого массива нужно умножить на каждый элемент второго массива.

Пусть из этих чисел получится отсортированная последовательность  длиной .
Выведите сумму каждого десятого элемента этой последовательности (то есть, ).

Формат входного файла
В первой строке содержатся числа  и  () — размеры массивов.
Во второй строке содержится  чисел — элементы массива .
Аналогично, в третьей строке содержится  чисел — элементы массива .
Элементы массива неотрицательны и не превосходят .

Формат выходного файла
Выведите одно число — сумму каждого десятого элемента последовательности,
полученной сортировкой попарных произведенй элементов массивов  и .*/
import java.util.Arrays;
import mooc.EdxIO;

public class Task11 {
    public static void main(String[] args) {
        EdxIO io = EdxIO.create();
        //размер массива
        int SizeA = io.nextInt();
        int SizeB = io.nextInt();
        //создание массива с исходными данными
        int[] ArrayA = new int[SizeA];
        int[] ArrayB = new int[SizeB];
        long[] ArrayC = new long[SizeA*SizeB];
        for (int i = 0; i < SizeA; i++) {
            ArrayA[i] = io.nextInt();
        }
        for (int i = 0; i < SizeB; i++) {
            ArrayB[i] = io.nextInt();
        }
        int count = 0;
        for (int i = 0; i < SizeA; i++) {
            for (int j =0; j < SizeB; j++){
                ArrayC[count++] = ArrayB[j]*ArrayA[i];
            }
        }

        a = ArrayC;
        n= ArrayC.length;
        QSort(0,n-1);
        long sum10 = 0;
for (int i=0; i <= ArrayC.length/10;i++){
    sum10 += ArrayC[i*10];
}

        io.println(sum10);
        io.close();
    }


    protected static int n;
    protected static long[] a = new long[n];

    static long getMax(long arr[], int n)
    {
        long max = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    static void countSort(long arr[], int n, int exp)
    {
        long output[] = new long[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[(int) ((arr[i] / exp) % 10)]++;

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(int) ((arr[i] / exp) % 10)] - 1] = arr[i];
            count[(int) ((arr[i] / exp) % 10)]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to curent digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    // The main function to that sorts arr[] of size n using
    // Radix Sort
    static void radixsort(long arr[], int n)
    {
        // Find the maximum number to know number of digits
        long max = getMax(arr, n);

        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed.
        // exp is 10^i where i is current digit number
        for (int exp = 1; max / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }

    // A utility function to print an array
    static void print(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }




    protected static void QSort(int left, int right) {
        int i;
        int j;
        long key;
        long buf;
        key = a[(left + right) / 2];
        i = left;
        j = right;
    while(i<=j) {
        while (a[i] < key) {
            i++;
        }
        while (key < a[j]) {
            j--;
        }
        if (i <= j) {
            buf = a[i];
            a[i] = a[j];
            a[j] = buf;
            i++;
            j--;
        }

        if (left < j) {
            QSort(left, j);
        }
        if (i < right) {
            QSort(i, right);
        }
    }
}}
