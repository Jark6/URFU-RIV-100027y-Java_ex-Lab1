package Task3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SortIns {

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        //размер массива
        int Size = in.nextInt();
        //создание массива с исходными данными
        int [] Array = new int [Size];
        for (int i=0;i<Size;i++){
            Array[i]=in.nextInt();
        }
        //сортировка вставками
        int [] ArrayTemp = new int [Size];
        int IntTemp;
        boolean flag = false;
        for (int j = 1; j<Size;j++){
        for (int i=j-1;i>=0;i--){
            if (Array[i]>Array[i+1]){
            IntTemp = Array[i];
            Array[i]=Array[i+1];
            Array[i+1]=IntTemp;
                ArrayTemp[j]=i;
                flag = true;
            }
                    }
            if (ArrayTemp[j] == 0 && flag == false){ArrayTemp[j]=j;}
            else flag = false;
        }
        for (int i=0;i<Size;i++){
            ArrayTemp[i]=ArrayTemp[i]+1;
        }

        //вывод отсортированного массива
        String ArrayString = "";
        String ArrayStringTemp = "";
        for (int i=0;i<Size;i++){
            ArrayString += Array[i]+" ";
            ArrayStringTemp +=ArrayTemp[i]+" ";
        }
        out.println(ArrayStringTemp+"\n"+ArrayString);
        out.flush();
    }
}
