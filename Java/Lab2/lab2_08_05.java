import java.util.Scanner;
public class lab2_08_05 
{
	public static void main(String[] args) 
	{
		// input parameter to check
		System.out.println("Input x:");
		try(Scanner scan = new Scanner(System.in))
		{
		int x = scan.nextInt();
		// dop parameter
		int y = x/1000;
		if (x >= 0) {
		System.out.printf("â x = %d, %d tselih tisjachi", x, y);
	}
		else {
			System.out.printf("x = %d otritsatelnoe chislo", x);}
}
}
}