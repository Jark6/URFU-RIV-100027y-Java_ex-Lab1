import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in, "ISO-8859-1");
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));

        String nick = in.nextLine();
        in.close();
        char[] nickChar = nick.toCharArray();

        boolean [] nickTest = new boolean [nickChar.length];
        boolean answer = true;
        /*if (testNextChar(nickChar[0])){
            first=1;
        }*/
        for(int i=0;i< nickChar.length;i++){
            nickTest[i] = testNextChar(nickChar[i]);
        }
        for(int i=0;i< nickTest.length-1;i++){
            if (nickTest[i]==nickTest[i+1]){
                answer = false;
            }
        }
if(!answer){System.out.print("NO");}
else{System.out.print("YES");}

        out.flush();
    }
    private static char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
    private static boolean testNextChar(char c){
        boolean result = false;
    for(int i = 0; i< vowels.length;i++){
         if(c==vowels[i]){
            result = true;
             //return result;
        }
    }
    return result;
    }
}
