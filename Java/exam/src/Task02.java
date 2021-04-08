/*
Напишите программу, в которой пользователю предлагается ввести название дня недели. 
По введенному названию программа определяет порядковый номер дня в неделе. 
Если пользователь вводит неправильное название дня, программа выводит сообщение о том, что такого дня нет. 
Предложите версию программы на основе вложенных условных операторов и на основе оператора выбора switch. 
 */

import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите день недели(кириллица, нижний регистр)");
        String day = id.nextLine();

        WeekDay.IfMethod(day);
        WeekDay.SwitchMethod(day);
    }

    static class WeekDay {

       static void IfMethod(String d) {
            String day = d;
            System.out.println("\nверсия программы на основе вложенных условных операторов");
            int dayN = 0;
            if (day.equals("понедельник")) {
                dayN = 1;
            } else if (day.equals("вторник")) {
                dayN = 2;
            } else if (day.equals("среда")) {
                dayN = 3;
            } else if (day.equals("четверг")) {
                dayN = 4;
            } else if (day.equals("пятница")) {
                dayN = 5;
            } else if (day.equals("суббота")) {
                dayN = 6;
            } else if (day.equals("воскресенье")) {
                dayN = 7;
            } else {
                System.out.println(day + " некорректное значение дня недели");
            }
            if (dayN != 0) {
                System.out.printf("%s это %s-й день недели\n", day, dayN);
            }
            return;
        }

        static void SwitchMethod(String d) {
            System.out.println("\nверсия программы на основе оператора выбора switch");
            String day = d;
            switch (day) {
                case "понедельник":
                    System.out.println(day + " это 1-ый день недели");
                    break;
                case "вторник":
                    System.out.println(day + " это 2-ой день недели");
                    break;
                case "среда":
                    System.out.println(day + " это 3-ий день недели");
                    break;
                case "четверг":
                    System.out.println(day + " это 4-ый день недели");
                    break;
                case "пятница":
                    System.out.println(day + " это 5-ый день недели");
                    break;
                case "суббота":
                    System.out.println(day + " это 6-ой день недели");
                    break;
                case "воскресенье":
                    System.out.println(day + " это 7-ой день недели");
                    break;
                default:
                    System.out.println(day + " некорректное значение дня недели");
                    break;
            }
        }

    }
}