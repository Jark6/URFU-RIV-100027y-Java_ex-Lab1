public class Lab3_08_08 {
    public static void main(String[] args) {
        int Size = 10;
        char chars[] = new char[Size]; // Создание массива с размером 10
        char i = 'A';
        char ExChars [] = {'A', 'E', 'I', 'O', 'U', 'Y'}; //создание массива гласных
        for (int x = 0; x < chars.length; i++) //заполнение массива
        {
            for (int y = 0; y < ExChars.length; y++) //проверка на соответсвие массива гласных
            {
                if (i == ExChars[y]) {
                    i++;
                }
            }
            chars[x] = i; // Присвоение x-тому элементу массива значения i
            System.out.println("Элемент массива ["+x+"] = " + chars[x]); // Сообщение пользователю
            x++;
        }
        System.out.println("конец массива\n"); // Сообщение пользователю 
    }
}