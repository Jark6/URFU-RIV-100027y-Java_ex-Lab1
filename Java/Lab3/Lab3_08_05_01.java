import java.util.Scanner;

public class Lab3_08_05_01 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in); // Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Ввведите количество чисел в сумме"); // Сообщение пользователю "для красоты и понимания"
        int x = id.nextInt(); // Запись в переменную x
        int sum = 0;
       for (int i = 0; x>0; i++)
       {
        if (i%5 == 2 || i%3 == 1) { // условие
            System.out.printf("%d\n", i);
            sum = sum + i;
            x--;
            }
        }
        System.out.printf("сумма чисел: %d", sum); // Сообщение пользователю
                  }

    }



