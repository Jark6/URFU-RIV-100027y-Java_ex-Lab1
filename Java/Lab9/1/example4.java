public class example4 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); //1. печатает "0"
            throw new RuntimeException("ошибка");
        }
        catch (NullPointerException e) { System.out.println("1 "+e); } //эта часть кода пропускается
        catch (Exception e) { System.out.println("2 "+e); } //2. исключение перехвачено и обработано, печатает "2" и исключение
        catch (Error e) { System.out.println("3 "+e); } //эта часть кода пропускается
        System.out.println("4"); //3. печатает "0"
    }
}
