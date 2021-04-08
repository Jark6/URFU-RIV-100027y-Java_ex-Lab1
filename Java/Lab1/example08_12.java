import java.util.Scanner;
public class example08_12{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input year of your birth: ");
        int age = in.nextInt();
        age=2020-age;
        System.out.printf("You are about %d years old\n", age);
        in.close();
    }
}