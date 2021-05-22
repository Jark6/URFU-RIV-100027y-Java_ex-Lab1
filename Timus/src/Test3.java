import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in, "ISO-8859-1");
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));

        long n = in.nextLong();
        long m = in.nextLong();
        long k = in.nextLong();
        long Cost[] = new long[(int)n];
        for (int i = 0; i<n;i++){
            Cost[i] = in.nextLong();
        }
        in.close();
        Arrays.sort(Cost);
        int r = (int) (n/m);
        if(n%m>0){r++;}
        long SendCost[] = new long[r];
        int count = 0;
        long sum=0;
        int remain = (int) (n%m);
        for (int i =0; i<r-1;i++){
            SendCost[i]= (long) ((Cost[(int) (count+m-1)]-Cost[count])*Math.pow(m,2))+k;
            count+=m;
            sum+=SendCost[i];
        }
        long z = 0;
        if (remain>0){
            z = (long) ((Cost[(int) (count+remain-1)]-Cost[count])*Math.pow(m,2))+k;
        }

sum+=z;
System.out.print(sum);

        out.flush();
    }
}
