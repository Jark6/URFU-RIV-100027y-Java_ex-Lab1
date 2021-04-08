/*
Во втором подклассе появляется защищенное символьное поле
конструктор с двумя параметрами
и переопреределен метод, отображающий в консоли название класса и значения полей
 */
package Lab7_08_05;

//на основе суперкласса создается подкласс
public class SecondSubClass extends FirstSupClass {

    //защищенное символьное поле
    protected char char1;

    public void setChar1(char char1) {
        this.char1 = char1;
    }
//конструктор с двумя параметрами
    SecondSubClass(String str1, char char1) {
        super(str1);
        this.setChar1(char1);
        }

        //переопределен метод для отображения значений полей объекта и названия класса
    @Override
    public void PrintToString() {
        String SecondFieldValue =
                " char1 = \"" + this.getChar1()+"\"";
        super.PrintToString();
        System.out.println(SecondFieldValue);
    }
    public char getChar1() {
        return char1;
    }
}
