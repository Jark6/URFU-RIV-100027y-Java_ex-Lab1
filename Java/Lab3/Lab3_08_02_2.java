import java.util.Scanner;
// пакет для подключения класса Scanner, для считывания с консоли значения

public class Lab3_08_02_2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in); // Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Введите день недели(кириллица, нижний регистр)"); // Сообщение пользователю "для красоты и понимания"
        String day = id.nextLine(); // Запись в переменную day
        switch(day)
        {
            case "понедельник":
                System.out.println(day + " это 1-ый день недели");
                break; // закончили
            case "вторник":
                System.out.println(day + " это 2-ой день недели");
                break; // закончили
            case "среда":
                System.out.println(day + " это 3-ий день недели");
                break; // закончили
            case "четверг":
                System.out.println(day + " это 4-ый день недели");
                break; // закончили
            case "пятница":
                System.out.println(day + " это 5-ый день недели");
                break; // закончили
            case "суббота":
                System.out.println(day + " это 6-ой день недели");
                break; // закончили
            case "воскресенье":
                System.out.println(day + " это 7-ой день недели");
                break; // закончили
            default: //иное
                System.out.println(day + " некорректное значение дня недели");
                break; // закончили
        }
                }
    }
