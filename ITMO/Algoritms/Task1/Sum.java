package Task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));

        int a = in.nextInt();
        int b = in.nextInt();
        out.println(a + b);
        out.flush();
    }
}
