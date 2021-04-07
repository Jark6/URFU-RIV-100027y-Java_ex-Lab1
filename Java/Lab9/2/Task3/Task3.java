/*В программе, вычисляющей сумму элементов типа byte одномерного массива,
вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
– ввод строки вместо числа;
– ввод или вычисление значения за границами диапазона типа.*/

package Task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        ESetArray();
SumArray(StatArray);
    }
    private static byte StatArray[];

    private static void ESetArray(){
        try{SetArray();}
        catch (InputMismatchException e){
            System.out.println("значение за пределами диапазона byte ("+e+")");
            ESetArray();
        }
        catch (Exception e){
            System.out.println("иное ("+e+")");
            ESetArray();
        }

    }
    private static void EInput(int i){
        try {
        Scanner scan = new Scanner(System.in);
        System.out.print("введите byte элемент массива "+"["+(i+1)+"]");
        StatArray[i]=scan.nextByte();}
        catch(InputMismatchException e){
            System.out.println("значение за пределами диапазона byte ("+e+")");
            EInput(i);}
    }
    private static byte[] SetArray() {
        Scanner scan = new Scanner(System.in);
        System.out.print("введите размер массива");
        int a = scan.nextInt();
        byte[] Array = new byte[a];
        StatArray = Array;
        for(int i=0;i<a;i++){
                           EInput(i);
                            }
        Array = StatArray;
        return Array;
    }

    private static void SumArray(byte [] InputArray){
        int A=0;
        //boolean flag = false;
        for (int j : InputArray) {
                A += j;
        }
        System.out.println("сумма элементов массива = ["+(A)+"]");
    }
}
