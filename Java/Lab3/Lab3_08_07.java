import java.util.Arrays;
//пакет для подключения класса Arrays, для сортировки элементов массива по возрастанию

public class Lab3_08_07 {
    public static void main(String[] args) {
        int Size = 10;
        char chars[] = new char[Size]; // Создание массива с размером 10
        char i = 's';
        for (int x = 0; x < Size; i--) {
            if (i%2 == 1) {
                chars[x] = i; // Присвоение x-тому элементу массива значения i
                System.out.println("Элемент массива ["+x+"] = " + chars[x]); // Сообщение пользователю
                x++;
            }
        }
        System.out.println("конец массива\n"); // Сообщение пользователю 
        Arrays.sort(chars); // Сортировка массива по возрастанию его элементов
        System.out.println("Произведена сортировка массива"); // Сообщение пользователю "для красоты и понимания"
        for (int x = 0 ; x < chars.length ; x++ ){
            System.out.println("Элемент массива ["+x+"] после сортировки = " + chars[x]); //Сообщение пользователю для красоты и понимания
        }
        System.out.println("конец массива"); // Сообщение пользователю 
    }

}
