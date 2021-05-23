import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class CurrencyParser {

    public static void main(String[] args) throws IOException {

        File f1=new File("C:\\Users\\vpk-0_000\\Desktop\\MyFile1.xls");
        f1.createNewFile();
        if (f1.exists()) {
            System.out.println("Create xls: "+ f1.getAbsolutePath());
        }

       PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\vpk-0_000\\Desktop\\MyFile1.xls"),"Cp1251"));
        List<Table> tableList = new ArrayList<>();

        Document doc = Jsoup.connect("https://www.cbr.ru/currency_base/daily/").get();

        Elements dateElements = doc.getElementsByClass("datepicker-filter");
        String Date = dateElements.text();

        Elements tableElements = doc.getElementsByTag("tr");
        tableElements.forEach(tableElement -> {
            String NumCode = tableElement.child(0).text();
            String LetCode = tableElement.child(1).text();
            String SumToChange = tableElement.child(2).text();
            String Currency = tableElement.child(3).text();
            String Course = tableElement.child(4).text();
            tableList.add(new Table(NumCode, LetCode, SumToChange, Currency, Course));
        });
        System.out.println(Date);
        tableList.forEach(System.out::println);
        out.println(Date);
        tableList.forEach(out::println);
        out.flush();
    }



        static class Table {
            private String NumCode;
            private String LetCode;
            private String SumToChange;
            private String Currency;
            private String Course;

            public String getNumCode() {
                return NumCode;
            }

            public void setNumCode(String numCode) {
                NumCode = numCode;
            }

            public String getLetCode() {
                return LetCode;
            }

            public void setLetCode(String letCode) {
                LetCode = letCode;
            }

            public String getSumToChange() {
                return SumToChange;
            }

            public void setSumToChange(String sumToChange) {
                SumToChange = sumToChange;
            }

            public String getCurrency() {
                return Currency;
            }

            public void setCurrency(String currency) {
                Currency = currency;
            }

            public String getCourse() {
                return Course;
            }

            public void setCourse(String course) {
                Course = course;
            }

            public Table(String numCode, String letCode, String sumToChange, String currency, String course) {
                NumCode = numCode;
                LetCode = letCode;
                SumToChange = sumToChange;
                Currency = currency;
                Course = course;
            }

            @Override
            public String toString() {
                return  NumCode + '\t' +
                        LetCode + '\t' +
                        SumToChange + '\t' +
                        Currency + '\t' +
                        Course + '\t'
                        ;
            }
        }
        static String Date;

}



