import java.util.Scanner;
public class lab2_08_01 
{
	public static void main(String[] args) 
	{
		// input parameter to check
		System.out.println("Input x:");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		// check
		if (x % 3==0) {
				System.out.printf("x = %d kratno 3\n", x);}
		if (x % 3!=0) {
				System.out.printf("x = %d ne kratno 3\n", x);}
	}
}