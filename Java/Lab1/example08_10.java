import java.util.Scanner;
public class example08_10{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kakoj segodnja den nedeli? ");
        String denned = in.nextLine();
        System.out.print("Kakoj seichas mesjac? ");
        String mesjac = in.nextLine();
        System.out.print("Kakaja segodnja data? ");
        int data = in.nextInt();
        System.out.printf("Segodnja %s %d-oe %s-a\n", denned, data, mesjac);
        in.close();
    }
}