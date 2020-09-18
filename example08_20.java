import java.util.Scanner;
public class example08_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input A: ");
        int A = in.nextInt();
        System.out.print("Input B: ");
        int B = in.nextInt();
        double C = Math.pow(A, B);
        System.out.println("A^B =" + C);
        in.close();
    }
}
