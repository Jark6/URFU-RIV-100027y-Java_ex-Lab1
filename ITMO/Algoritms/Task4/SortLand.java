package Task4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SortLand {

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("input.txt").getAbsoluteFile());
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        //размер массива
        int Size = in.nextInt();
        //создание массива с исходными данными
        float [] Array = new float [Size];
        int [] Index = new int[Size];
        for (int i=0;i<Size;i++){
            Array[i]=in.nextFloat();
            Index[i]=i+1;
        }
        //сортировка вставками

        int IntTemp;
        float FloatTemp;
        for (int j = 1; j<Size;j++){
        for (int i=j-1;i>=0;i--){
            if (Array[i]>Array[i+1]){
            FloatTemp = Array[i];   Array[i]=Array[i+1];    Array[i+1]=FloatTemp;
            IntTemp = Index[i];     Index[i]=Index[i+1];    Index[i+1]=IntTemp;
                        }
                    }
        }
        //вывод индекса беднейшего, среднего, богатейшего
        out.println(Index[0]+" "+Index[Size/2]+" "+Index[Size-1]);
        out.flush();
    }
}
