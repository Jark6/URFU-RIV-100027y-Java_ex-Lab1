import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in, "ISO-8859-1");
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));

        int H = in.nextInt();
        int M = in.nextInt();
        int S = in.nextInt();
        long CountS = in.nextLong();
        in.close();

        int CountR = (int)CountS%(H*M*S);
        int Hours = CountR/(M*S);
        int Minutes = CountR%(M*S)/S;
        int Seconds = CountR%(M*S)%S;

System.out.print(Hours+" "+Minutes+" "+Seconds);

        out.flush();
    }
}
