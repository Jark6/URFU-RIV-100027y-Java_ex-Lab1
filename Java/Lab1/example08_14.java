import java.util.Scanner;
public class example08_14{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = in.nextInt();
        age=2020-age;
        System.out.printf("You were born in %d \n", age);
        in.close();
    }
}