import java.util.Scanner;
public class example08_19 {
    //y=exp(b*log(a))
    private static double pow(int a, int b) {
        return Math.exp(b*Math.log(a));
    }

    private static double hyp(int a, int b){
        return Math.sqrt(pow(a, 2)+pow(b, 2));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("katet а:");
        int a = in.nextInt();
        System.out.println("katet b:");
        int b = in.nextInt();
        System.out.println("hypotenuse c=" + hyp(a,b));
    }
}