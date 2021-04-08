import java.util.Scanner;
public class example08_13{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input year of your birth: ");
        int age = in.nextInt();
        age=2020-age;
        System.out.printf("Hi, %s! You are %d years old\n", name, age);
        in.close();
    }
}