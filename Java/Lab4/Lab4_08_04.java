//В данной программе создается двумерный массив, который выводит прямоугольный треугольник;
import java.util.Scanner;

public class Lab4_08_04 {
    public static void main(String[] args) {
       Scanner id = new Scanner(System.in);// Создание объекта класса Scanner
       System.out.print("введите высоту прямоугольника: ");// пользоватьелю
       int height = id.nextInt(); // число строк которое необходимо вывести
        char [][] graph = new char [height][]; //создание элемента массива необходимого размера
        for (int i=0;i<graph.length;i++){//резервирование памяти для второго измерения массива
            int j = i+1;
            graph[i]=new char[j];
        }
        int z = 0; //переменная для вывода количества строк
          for (int i =0; i < height; i++){//заполнение массива
              for (int j = 0; j <i+1; j++){
                    graph[i][j] = '@';
            }
        }
        for (int i =0; i < height; i++){//печать массива
            int count = i+1;//переменная для повышения номера индекса для вывода на консоль
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j < graph[i].length; j++){
                System.out.print(graph[i][j]+" ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0; //обнуление счетчика
        }
    }
}
