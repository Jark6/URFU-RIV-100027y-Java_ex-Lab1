/*
Напишите программу, в которой создается массив п заполняется случайными числами.
Массив отображается в консольном окне.
В этом массиве необходимо определить элемент с минимальным значением.
В частности, программа должна вывести значение элемента с минимальным значением и индекс этого элемента.
Если элементов с минимальным значением несколько, должны быть выведены индексы всех этих элементов.
 */

import java.util.Random;
import java.util.Scanner;
public class Task24 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int Size = id.nextInt();
        System.out.println("Размер массива равен " + Size);
        int[] nums = new int[Size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200); // Присвоение i-тому элементу массива случайного значения
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);
        }
        System.out.println("Конец массива nums[i]\n");
        int[] min_count = new int[Size]; // создание массива для отслеживания индекса
        int[] min_nums = new int[Size]; // создание массива для отслеживания повторяющегося минимального значения
        int min = nums[0]; // создание переменной с минимальным значением
        for (int l = 0; l < 2; l++) { // расчет минимальных значений
            for (int j = 0; j < nums.length; j++) {
                if (min >= nums[j]) {
                    min_count[j] = j;
                    min = nums[j];
                    min_nums[j] = nums[j];
                } else {
                    min_count[j] = 0;
                    min_nums[j] = 0;
                }
            }
        }
        for (int k = 0; k < nums.length; k++) { // Вывод итогового сообщения
            if (min_nums[k] == min && min_count[k] != 0) {
                System.out.println("Элемент массива [" + min_count[k] + "]" + min_nums[k] + "- минимальное значение");
            }
        }
    }
}
