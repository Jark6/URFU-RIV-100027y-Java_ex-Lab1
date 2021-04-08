import java.util.Scanner;
// пакет для подключения класса Scanner, для считывания с консоли значения

public class Lab3_08_01 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in); // Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Введите порядковый номер дня недели"); // Сообщение пользователю "для красоты и понимания"
        int day = id.nextInt(); // Запись в переменную day
        switch(day)
        {
            case 1:
                System.out.println(day + " День недели - понедельник");
                break; // закончили
            case 2:
                System.out.println(day + " День недели - вторник");
                break; // закончили
            case 3:
                System.out.println(day + " День недели - среда");
                break; // закончили
            case 4:
                System.out.println(day + " День недели - четверг");
                break; // закончили
            case 5:
                System.out.println(day + " День недели - пятница");
                break; // закончили
            case 6:
                System.out.println(day + " День недели - суббота");
                break; // закончили
            case 7:
                System.out.println(day + " День недели - воскресенье");
                break; // закончили
            default: //иное
                System.out.println(day + " некорректное значение");
                break; // закончили
        }
                }
    }
