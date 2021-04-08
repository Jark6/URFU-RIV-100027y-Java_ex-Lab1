import java.util.Scanner; // пакет для подключения класса Scanner

public class Lab3_08_04_01 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in); // Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Ввведите первое целое число"); // Сообщение пользователю "для красоты и понимания"
        int x = id.nextInt(); // Запись в переменную x
        System.out.println("Ввведите второе целое число"); // Сообщение пользователю "для красоты и понимания"
        int y = id.nextInt(); // Запись в переменную y
        if (x > y) { // если x > y
            for (int y1 = y; y1 <= x; y1++) {
                System.out.printf("%d\n", y1);
            }
        }
        else { // если y > x
            for (int x1 = x; x1 <= y; x1++) {
                System.out.printf("%d\n", x1);
            }
                  }
        System.out.println("конец числового ряда"); // Сообщение пользователю
    }
}


