import java.util.Scanner;
import java.util.Random;

public class Lab3_08_05_02 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in); // Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Ввведите количество чисел в сумме"); // Сообщение пользователю "для красоты и понимания"
        int x = id.nextInt(); // Запись в переменную x
        int sum = 0; // создание перемнной для записи суммы
        Random random = new Random(); // Создание объекта класса Random для генерации "случайного" числа
       while (x>0)
       {
           int nums = random.nextInt(1000); // генерация "случайного" числа
        if (nums%5 == 2 || nums%3 == 1) // условие
        {
            System.out.printf("%d\n", nums);
            sum = sum + nums;
            x--;
            }
        }
        System.out.printf("сумма чисел: %d", sum); // Сообщение пользователю
                  }

    }



