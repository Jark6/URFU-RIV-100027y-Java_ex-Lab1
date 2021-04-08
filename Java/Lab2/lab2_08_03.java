import java.util.Scanner;
public class lab2_08_03 
{
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