import java.util.Scanner;
public class lab2_08_02 
{
	public static void main(String[] args) 
	{
		// input parameter to check
		System.out.println("Input x:");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		// check
		if (x % 5==2 && x % 7==1) {
				System.out.printf("x = %d udovletvorjaet uslovijam: x/5 - v ostatke 2, x/7 - v ostatke 1\n", x);}
		else {
				System.out.printf("x = %d ne udovletvorjaet uslovijam: x/5 - v ostatke 2, x/7 - v ostatke 1\n", x);}
	}
}
