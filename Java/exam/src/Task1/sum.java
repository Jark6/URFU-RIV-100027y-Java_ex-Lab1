package Task1;

import java.io.*;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("src\\Task1\\input.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("src\\Task1\\output.txt"));

        int a = in.nextInt();
        int b = in.nextInt();
        out.println(a + b);
        out.flush();
    }
}
