/*
Напишите программу, в которой создается двумерный целочисленный массив.
Он заполняется случайными числами. Затем в этом массиве строи и столбцы меняются местами:
первая строка становится первым столбцом, вторая строка становиться вторым столбцом и так далее.
Например, если исходный массив состоял из 3 строк и 5 столбцов,
то в итоге получаем массив из 5 строк и 3 столбцов.
 */

import java.util.Random;//пакет для подключения класса Random, для генерации случайных чисел
import java.util.Scanner;//пакет для подключения класса Scanner

public class Lab4_08_05 {
    public static void main(String[] args) {
        Random random = new Random(200); // Создание объекта класса Random
        Scanner id = new Scanner(System.in);// Создание объекта класса Scanner
        System.out.print("введите количество  столбцов массива: "); // пользоватьелю
        int a = id.nextInt(); // число строк которое необходимо вывести
        System.out.print("введите количество строк массива: ");// пользоватьелю
        int b = id.nextInt(); // число строк которое необходимо вывести
        int firstArray[][] = new int[a][b]; //создание массива
        for (int i = 0 ; i <a; i++) {//заполнение массива
            for (int j = 0 ; j <b; j++) {
            firstArray[i][j] = random.nextInt(200); //подстановка случайных значений
                    System.out.println("i = "+i+"; j= "+j+"; value= "+firstArray[i][j]); //печать
                          }
                        }
        System.out.println("===================================");

        int secondArray[][] = new int[b][a]; // создание транспонированного массива
        for (int i = 0 ; i <b; i++) {
            for (int j = 0 ; j <a; j++) {
                secondArray[i][j] = firstArray[j][i]; // подстановка обратных значенией
                System.out.println("i = "+i+";j= "+j+";value= "+secondArray[i][j]);//печать
        }
            }
    }
}