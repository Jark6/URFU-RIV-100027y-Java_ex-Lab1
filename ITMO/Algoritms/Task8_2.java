import mooc.EdxIO;

public class Task8_2 {
    public static void main(String[] args) {
        EdxIO io = EdxIO.create();
        //размер массива
        int Size = io.nextInt();
        int[] Array = new int[Size];
        //создание массива с исходными данными
        for (int i = 0; i < Size; i++) {
            Array[i] = i + 1;
        }
        n = Size;
        a = Array;
        AQSort(/*0, (Size - 1)*/);


        StringBuilder ArrayString = new StringBuilder();
        for (int i = 0; i < Size; i++) {
            ArrayString.append(a[i]).append(" ");
        }
        io.println(ArrayString);
        io.close();
    }



protected static int n;
protected static int [] a = new int[n];
protected static void AQSort(/*int left, int right*/) {
   int buff;
    /* int i, j, key, buf;
    key = a[(left + right) / 2];
    i = left;
    j = right;
    *//*while(i<=j) {
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
            }*/
for(int i = 2; i<n;i++){
    a[i] = i + 1;
    buff = a[i / 2];
    a[i / 2] = a[i];
    a[i] = buff;
}
}
   /*     if (left < j) {
            AQSort(left, j);
        }
        if (i < right) {
            AQSort(i, right);*//**//*
        }*//*
    }*/
}
