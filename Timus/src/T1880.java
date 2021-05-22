import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class T1880 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in, "ISO-8859-1");
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
        int a,b,c;
        int count = 0;
        a = in.nextInt();
        long[] numA = new long[a];
        for (int i = 0; i < a; i++) {      numA[i] = in.nextLong();     }
        b = in.nextInt();
        long[] numB = new long[b];
        for (int i = 0; i < b; i++) {            numB[i] = in.nextLong();   }
        c = in.nextInt();
        long[] numC = new long[c];
        for (int i = 0; i < c; i++) {        numC[i] = in.nextLong();      }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (numA[i]==numB[j]){
                for (int k = 0; k < a; k++) {
                    if (numB[i]==numC[k]) {
                        count++;
                    }
                }
                }
            }
        }


        in.close();
        System.out.println(count);
        out.flush();
    }
}
