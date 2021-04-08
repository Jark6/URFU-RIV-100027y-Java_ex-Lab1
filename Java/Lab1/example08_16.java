import java.util.Scanner;
public class example08_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input A: ");
        int A = in.nextInt();
        int B = A-1;
        int C = A+1;
        int D = (A+B+C)*(A+B+C);
        System.out.println("A-1=" + B);
        System.out.println("A=" + A);
        System.out.println("A+1=" + C);
        System.out.println("(A+(A+1)+(A-1))^2=" + D);
        in.close();
    }
}
