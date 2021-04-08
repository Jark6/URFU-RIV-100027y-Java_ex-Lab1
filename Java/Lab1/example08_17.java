import java.util.Scanner;
public class example08_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input A: ");
        int A = in.nextInt();
        System.out.print("Input B: ");
        int B = in.nextInt();
        int C = A + B;
        int D = A - B;
        int E = B - A;
        System.out.printf("A+B = %d \n", C);
        System.out.printf("A-B = %d \n", D);
        System.out.printf("B-A = %d \n", E);
        in.close();
    }
}
