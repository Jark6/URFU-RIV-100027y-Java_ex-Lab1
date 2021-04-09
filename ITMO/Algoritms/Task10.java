/*«Сортировка пугалом» — это давно забытая народная потешка,
которую восстановили по летописям специалисты платформы «Открытое образование» специально для этого курса.

Участнику под верхнюю одежду продевают деревянную палку, так что у него оказываются растопырены руки,
как у огородного пугала. Перед ним ставятся  матрёшек в ряд.
Из-за палки единственное, что он может сделать — это взять в руки две матрешки на расстоянии
друг от друга (то есть -ую и -ую), развернуться и поставить их обратно в ряд, таким образом поменяв их местами.

Задача участника — расположить матрёшки по неубыванию размера. Может ли он это сделать?

Формат входного файла
В первой строчке содержатся числа  и   — число матрёшек и размах рук.

Во второй строчке содержится  целых чисел, которые по модулю не превосходят  — размеры матрёшек.

Формат выходного файла
Выведите «YES», если возможно отсортировать матрёшки по неубыванию размера, и «NO» в противном случае.*/
import mooc.EdxIO;

public class Task10 {
    public static void main(String[] args) {
        EdxIO io = EdxIO.create();
        //размер массива
        int Size = io.nextInt();
        int sweep = io.nextInt();
        //создание массива с исходными данными
        int[] Array = new int[Size];
        for (int i = 0; i < Size; i++) {
            Array[i] = io.nextInt();
        }
        a = Array;
        n= Size;
        QSort(0,n-1,sweep);
   /*if (sweep >1){
        CrowSort(a, sweep);}*/
        if (CheckSort(a) || sweep==1){io.println("YES");}
        else{io.println("NO");}
        io.close();
    }

    protected static void CrowSort(int[] a, int k) {
        int buf;
        boolean check = true;
        if (k > n) {
            return;
        }
        while (check) {
            check = false;
            for (int i = 0; (i + k) <= n-1; i++) {
                if (a[i] > a[(i + k)]) {
                    buf = a[i];
                    a[i] = a[i + k];
                    a[i + k] = buf;
                    check = true;
                }
            }
        }
        }

    protected static void CrowSort2(int[] a,int left, int right, int k) {
        int buf;
        if (k > n) {
            return;
        }
        int x = (right-left)/k;
        /*int key = a[right*z];

        while (check) {
            check = false;
            for (int i = 0; (i + k) <= n-1; i++) {
                if (a[i] > a[(i + k)]) {
                    buf = a[i];
                    a[i] = a[i + k];
                    a[i + k] = buf;
                    check = true;
                }
            }
        }*/
    }

    protected static int n;
    protected static int[] a = new int[n];

    protected static void QSort(int left, int right, int k) {
        if (k>right-left){return;}
        int i, j, buf;
        i = left;
        j=right;
        for (int z= 0; z<k; z++){
            int x = (right-left)/k;
            int key = a[left + x*k];


            int l = left +z; int r = right - (right-left)%k+z;
            while(l<=r){
                while (a[l] < key && l<x && a[l+k]<n) {
                    l+=k;
                }
                while (a[r] > key && r>=x && a[r-k]>=0) {
                    r-=k;
                }
                if (l < r && a[l]>key && a[r] < key) {
                    buf = a[l];
                    a[l] = a[r];
                    a[r] = buf;
                }
                i=l;
                j=r;
            }
        }


        if (left+k < j) {
            QSort(left, j, k);
        }
        if (i+k < right) {
            QSort(i, right, k);
        }
    }

    protected static boolean CheckSort(int[] a) {
        for (int i = 1; i < n; ++i) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
