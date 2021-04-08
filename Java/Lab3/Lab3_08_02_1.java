import java.util.Scanner;
// пакет для подключения класса Scanner, для считывания с консоли значения

public class Lab3_08_02_1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in); // Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Введите день недели(кириллица, нижний регистр)"); // Сообщение пользователю "для красоты и понимания"
        String day = id.nextLine(); // Запись в переменную day
        int dayN = 0;

            if (day.equals("понедельник")) {
                dayN = 1;}
                else if (day.equals("вторник")) {
                    dayN = 2;}
                   else if (day.equals("среда")) {
                        dayN = 3;}
                       else if (day.equals("четверг")) {
                            dayN = 4;}
                           else if (day.equals("пятница")) {
                                dayN = 5;}
                               else if (day.equals("суббота")) {
                                    dayN = 6;}
                                   else if (day.equals("воскресенье")) {
                                        dayN = 7;}

                                    else {
                                        System.out.println(day + " некорректное значение дня недели");
                                    }
        System.out.printf("%s это %s -й день недели" ,day ,dayN);
                                }
                            }