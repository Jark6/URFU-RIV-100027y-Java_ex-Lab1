public class example2 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); //1. печатает "0"
            throw new RuntimeException("Непроверяемая ошибка");
            //System.out.println("1"); - эта часть кода не выполняется
        }
        catch (Exception e) {
            System.out.println("2 "+ e ); //2. исключение перехвачено обработано, печатает "1" и исключение
        }
        System.out.println("3"); //3. печатает "3"
    }
}
