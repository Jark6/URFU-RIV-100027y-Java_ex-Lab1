import java.util.Scanner;
public class lab2_08_10
{
	public static void main(String[] args) 
	{
		// input parameter to check
		System.out.println("Input x:");
		try(Scanner scan = new Scanner(System.in))
		{
		int x = scan.nextInt();
		// dop parameter
		int y = (x/8) % 8;
		if (x > 0) {
		System.out.printf("x = %d po osnovaniju 10, %d vtoraja tsifra po osnovaniu 8", x, y);
	}
		else {
			System.out.printf("x = %d menshe 8", x);}
}
}
}