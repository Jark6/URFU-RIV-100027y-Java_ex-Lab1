import java.util.Scanner;
public class lab2_08_04 
{
	public static void main(String[] args) 
	{
		// input parameter to check
		System.out.println("Input x:");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		// check
		if (x >= 5 && x <= 10) {
				System.out.printf("x = %d v diapazone ot 5 do 10", x);}
		else {
				System.out.printf("x = %d za predelom diapazona ot 5 do 10", x);}
	}
}
