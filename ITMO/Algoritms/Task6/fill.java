package Task6;
import mooc.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;

public class fill {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("src\\Task6\\input.txt"));
        String Med = "";
        for(int i = 0; i<100000; i++){
            Med += i+" ";
            }
        out.println(Med);
        }

    }

