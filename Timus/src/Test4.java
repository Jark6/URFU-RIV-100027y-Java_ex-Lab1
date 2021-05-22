import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in, "ISO-8859-1");
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));

        int n = in.nextInt();
        int Empl[] = new int[n];
        int count[] = new int[n];

        for (int i = 0; i<n;i++){
            Empl[i] = in.nextInt();
            count[i] = 1;
        }
        in.close();
        for (int i = 0; i<n;i++){
            for (int j = i; j<n; j++){
                if(Empl[j]<Empl[j+1]){
                    count[i]++;
                }
            }
        }
        for (int i = 0; i<n;i++){
            System.out.print(count[i]+" ");
        }

        out.flush();
    }
}
