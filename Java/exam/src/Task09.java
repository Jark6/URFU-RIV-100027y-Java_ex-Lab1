/*
Напишите программу, которая проверяет, удовлетворяет ли введенное пользователем число следующим критериям:
число делится на 4 и при этом оно не меньше 10.
 */

import java.util.Scanner;
public class Task09 {
    public static void main(String[] args)
    {
        // input parameter to check
        System.out.println("Input x:");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        // check
        if (x % 4==0 && x > 10) {
            System.out.printf("x = %d kratno 4, x>10\n", x);}
        else {
            System.out.printf("x = %d ne udovletvorjaet uslovijam: x kratno 4, x>10\n", x);}
    }
}
