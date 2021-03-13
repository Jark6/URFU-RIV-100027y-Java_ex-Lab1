package Task2;

import java.io.*;
import java.util.*;

public class SumExp {

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));

        long a = in.nextLong();
        long b = in.nextLong();
        out.println(a + b*b);
        out.flush();
    }
}
