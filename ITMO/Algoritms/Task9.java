/*Дан массив из  элементов. Какие числа являются -ым, -ым, …, -ым в порядке неубывания в этом массиве?

Формат входного файла
В первой строке входного файла содержатся три числа:  — размер массива, а также границы интервала  и , при этом , , .

Во второй строке находятся числа , , , , , по модулю не превосходящие .
Вы должны получить элементы массива, начиная с третьего, по формуле: .
Все вычисления должны производится в 32-битном знаковом типе, переполнения должны игнорироваться.

Обращаем Ваше внимание, что массив из  32-битных целых чисел занимает в памяти 160 мегабайт! Будьте аккуратны!

Подсказка: эту задачу лучше всего решать модификацией быстрой сортировки.
Однако сортировка массива целиком по времени, скорее всего, не пройдет, поэтому нужно подумать,
как модифицировать быструю сортировку, чтобы не сортировать те части массива, которые не нужно сортировать.*/
import mooc.EdxIO;

public class Task9 {
    public static void main(String[] args) {
        EdxIO io = EdxIO.create();
        //размер массива
        int Size = io.nextInt();
        int k1 = io.nextInt();
        int k2 = io.nextInt();
        int A = io.nextInt();
        int B = io.nextInt();
        int C = io.nextInt();
        int a1 = io.nextInt();
        int a2 = io.nextInt();
        int[] Array = new int[Size];
        //создание массива с исходными данными
        Array[0]=a1;
        Array[1]=a2;
        for (int i = 2; i < Size; i++) {
            Array[i] = A*Array[i-2]+B*Array[i-1]+C;
        }
        n = Size;
        a = Array;
        QSort(0, (Size - 1),k1-1,k2-1);


        StringBuilder ArrayString = new StringBuilder();
        for (int i = k1-1; i <= k2-1; i++) {
            ArrayString.append(a[i]).append(" ");
        }
        io.println(ArrayString);
        io.close();
    }



protected static int n;
protected static int [] a = new int[n];

protected static void QSort(int left, int right,int k1, int k2) {
     int i, j, key, buf;
    key = a[(left + right) / 2];
    i = left;
    j = right;
    if(i==j||i>k2||j<k1) {
        return;
    }
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
}
        if (left < j) {
            QSort(left, j,k1,k2);
        }
        if (i < right) {
            QSort(i, right,k1,k2);
        }
    }
}
