import java.util.Scanner;

public class Lab3_08_04_02 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in); // Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Ввведите первое целое число"); // Сообщение пользователю "для красоты и понимания"
        int x = id.nextInt(); // Запись в переменную x
        System.out.println("Ввведите второе целое число"); // Сообщение пользователю "для красоты и понимания"
        int y = id.nextInt(); // Запись в переменную y
        if (x > y) { // если x > y
            while (y <= x) {
                System.out.printf("%d\n", y);
                y++;
            }
        }
        else { // если y > x
            while (x <= y) {
                System.out.printf("%d\n", x);
                x++;
            }
                  }
        System.out.println("конец числового ряда"); // Сообщение пользователю
    }
}


