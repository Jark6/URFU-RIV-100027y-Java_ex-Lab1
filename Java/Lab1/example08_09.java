import java.util.Scanner;
public class example08_09{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input age: ");
        int age = in.nextInt();
        System.out.printf("Tebja zovut %s i tebe %d let \n", name, age);
        in.close();
    }
}