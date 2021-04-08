import java.util.Scanner;
public class example08_11{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input month: ");
        String month = in.nextLine();
        System.out.print("Input month day amount: ");
        int day = in.nextInt();
        System.out.printf("Interesting fact. There are %d days in %s \n", day, month);
        in.close();
    }
}