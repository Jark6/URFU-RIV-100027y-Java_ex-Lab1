/*
Напишите программу, которая выводит в консольное окно прямоугольный треугольник;
 */

public class Task11 {
    public static void main(String[] args) {
        int height = 15; // число столбцов которое необходимо вывести
        int z = 0; // переменная необходима для вывода служебного сообщения о количестве символов в строке;
        for (int i = 1; i <= height; i++) {
            System.out.print("номер строки: " + i + " ");
            for (int j = 0; j <= z; j++) {
                System.out.print("+");
            }
            z = z + 1;
            System.out.println(" Количество символов в строке " + z);
        }
    }
}
