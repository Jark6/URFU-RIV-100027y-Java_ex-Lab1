/*
Ввести с клавиатуры список из n целых чисел.
а) Найти сумму, количество и среднее значение среди чисел, делящихся на 7.
б) Найти среди положительных чисел данного массива минимальное и максимальное значения и их номера и поменять их местами.
 */

package Lab08_07;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
}
class Node {
    protected int value;
    protected Node next;

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
class Task {
    private int inputValue;
    protected Node head;

    void InputNums(){
        Scanner input = new Scanner(System.in);
        this.head = null;
        while (input != "s"){
        System.out.println("Введите цифры (чтобы прекратить ввод, нажмите \"s\"):");
        addHead(input.nextInt());
        }
        System.out.println("ввод закончен");
    }

    protected void addHead(int value) {
        Node head=new Node(value, this.head);
          }
}

}

