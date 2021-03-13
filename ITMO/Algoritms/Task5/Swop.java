package Task5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Swop {

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        //размер массива
        int Size = in.nextInt();
        //создание массива с исходными данными
        int [] Array = new int [Size];
        int [][] SwapLog = new int[2][Size];
        for (int i=0;i<Size;i++){
            Array[i]=in.nextInt();
        }
        //сортировка вставками
        int n = 0;
        boolean t = true;
        int IntTemp;
        /*int IndexTemp1=0, IndexTemp2=0;*/
        for (int j=0;j<Size;j++){
            int min = Array[j];
            for (int z=j;z<Size;z++){
                min=Math.min(min,Array[z]);
            }
        if (min != Array[j]) {
            for (int i = j; i < Size; i++) {
                if (min == Array[i]) {
                    IntTemp = Array[j];
                    Array[j] = Array[i];
                    Array[i] = IntTemp;
                    out.println("Swap elements at indices " + (j+1) + " and " + (i + 1) + ".");
                }
            }
        }
        }
        /*for (int j = 1; j<Size;j++){
        for (int i=j-1;i>=0;i--){
            if (Array[i]>Array[i+1]){
                IntTemp = Array[i];   Array[i]=Array[i+1];    Array[i+1]=IntTemp;
                if (t){IndexTemp1 = i+2; t=false; }
                if (!t && Array[i]<=Array[i+1]){IndexTemp2=i+1;}
                        }
        }
        if(!t){SwapLog[0][n]=IndexTemp2;        SwapLog[1][n]=IndexTemp1;          n++;        t=true;}
        }
        //вывод журнала
        for (int i=0; i<Size && SwapLog[0][i] !=0; i++){
        out.println("Swap elements at indices "+SwapLog[0][i]+" and "+SwapLog[1][i]+".");}*/
        out.println("No more swaps needed.");

        out.flush();
    }
}
