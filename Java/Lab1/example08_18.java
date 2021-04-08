import java.util.Scanner;
public class example08_18 {
    //y=exp(b*log(a))

    private static double hyp(int a, int b){
        return Math.sqrt(Math.exp(2*Math.log(a))+Math.exp(2*Math.log(b)));
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
