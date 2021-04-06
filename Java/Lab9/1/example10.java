public class example10 {
    public static int m(){
        try {
            System.out.println("0"); //1. печатает "0"
            return 15; //2. выход из метода с присвоением значения "15"
        }
        finally { //т.к. finally - выполняется еще эта часть кода
            System.out.println("1"); //3. печатает "1"
            return 20; //4. выход из метода с заменой значения "15" на "20"
             }
    }
    public static void main(String[] args) { System.out.println(m()); } //5. печатает значение метода "20"
}
