import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test0 {
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in, "ISO-8859-1");
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
        int[]one = new int[2];
        int[]two = new int[2];
        int temp1=-1,temp2=-1;
        int[]result = new int[4];
        one[0]=in.nextInt();
        one[1]=in.nextInt();
        two[0]=in.nextInt();
        two[1]=in.nextInt();
        in.close();
        for (int i= 0; i<2;i++) {
            for (int j = 0; j < 2; j++) {
                if (one[i] == two[j]) {
                    temp1 = i;
                    temp2 = j;
                }
            }
        }
        if(temp1!=-1){
            if(temp1==0){result[0]=one[1]; result[1]=one[0]; result[2]=two[temp2];}
            else{result[0]=one[0]; result[1]=one[1]; result[2]=two[temp2];}
            if(temp2==0){result[3]=two[1];}
            else{result[3]=two[0];}
            for(int i = 0; i<4; i++){
                System.out.print(result[i]+" ");
            }
        }
        else{System.out.print(-1);}


        out.flush();
    }
}