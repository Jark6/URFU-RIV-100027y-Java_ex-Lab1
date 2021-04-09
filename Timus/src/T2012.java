import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class T2012 {
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in, "ISO-8859-1");
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
        byte f;
        String Answer = "YES";
        f=in.nextByte();
        in.close();
        int calc = 12-f;
        if(calc>5){Answer="NO";}

        System.out.print(Answer);
        out.flush();
    }
}
