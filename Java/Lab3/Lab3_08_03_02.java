import java.util.Scanner;
// пакет для подключения класса Scanner, для считывания с консоли значения

public class Lab3_08_03_02 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in); // Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Ввведите количество чисел Фибоначчи"); // Сообщение пользователю "для красоты и понимания"
        int x = id.nextInt(); // Запись в переменную x
        long k = 0; // Запись в переменную k (первое число)
        long l = 1; // Запись в переменную l (второе число)
        long m = 1; // Запись в переменную m (сумма чисел)
        while(x > 0) {
            System.out.printf("%d\n", m);
            m = k + l;
            k = l;
            l = m;
            x--;
                }
        System.out.println("конец цикла");
    }
}

