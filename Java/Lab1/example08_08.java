import java.util.Scanner;
public class example08_08{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Surname: ");
        String Surname = in.nextLine();
        System.out.print("Input Name: ");
        String Name = in.nextLine();
        System.out.print("Input Middle-name: ");
        String Middle = in.nextLine();
        System.out.printf("Hello %s %s %s !!!\n", Surname, Name, Middle);
        in.close();
    }
}