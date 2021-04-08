/*
Напишите программу с классом, в котором есть закрытое символьное поле и три открытых метода.
1 Один из методов позволяет присвоить значение полю.
2 Еще один метод при вызове возвращает результатом код символа.
3 Третий метод позволяет вывести в консольное окно символ (значение поля) и его код.
 */

public class Task18 {
    public static void main(String[] args) {
        Example Example1 = new Example();
        Example1.viewCode();

        Example1.Set('A');
        System.out.println("Char code = " + Example1.getCodeSymbol()+"\n");

        Example1.viewCode();
    }
}
class Example {
    // Создание закрытой переменной ch1
    private char ch;
    //Один из методов позволяет присвоить значение полю.
    public void Set(char ch1) {
        this.ch = ch1;
    }
    //Еще один метод при вызове возвращает результатом код символа.
    public int getCodeSymbol() {
        return (int) ch;
    }
    //Третий метод позволяет вывести в консольное окно символ (значение поля) и его код.
    public void viewCode() {
        System.out.println("ch1 = " + ch);
        //int code = ch;
        System.out.println("ch1 = " + getCodeSymbol()+"\n");
    }
}
