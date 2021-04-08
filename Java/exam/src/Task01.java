/*
 *Напишите программу, в которой пользователь вводит целое число в диапазоне от 1 до 7,
 *а программа определяет по этому числу день недели.
 *Если введенное пользователем число выходит за допустимый диапазон,
 *выводится сообщение о том, что введено некорректное значение.
 *Используйте оператор выбора switch.
 */

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите порядковый номер дня недели");
        int day = id.nextInt();
        switch(day)
        {
            case 1:
                System.out.println(day + " День недели - понедельник");
                break;
            case 2:
                System.out.println(day + " День недели - вторник");
                break;
            case 3:
                System.out.println(day + " День недели - среда");
                break;
            case 4:
                System.out.println(day + " День недели - четверг");
                break;
            case 5:
                System.out.println(day + " День недели - пятница");
                break;
            case 6:
                System.out.println(day + " День недели - суббота");
                break;
            case 7:
                System.out.println(day + " День недели - воскресенье");
                break;
            default:
                System.out.println(day + " - некорректное значение");
                break;
        }
    }
}