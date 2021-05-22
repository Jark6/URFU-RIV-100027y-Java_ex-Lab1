import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
/*import  org.apache.poi.hssf.usermodel.HSSFSheet;
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;
import  org.apache.poi.hssf.usermodel.HSSFRow;
import org.jsoup.nodes.Element;*/

public class Parser4 {

    public static void main(String[] args) throws IOException {
        // List<Article> articleList = new ArrayList<>();
        PrintWriter out = new PrintWriter(new FileWriter("\\java\\MyFile1.xls"));
        List<Table> tableList = new ArrayList<>();

        Document doc = Jsoup.connect("https://www.cbr.ru/currency_base/daily/").get();
/*
        Elements tableElements = doc.getElementsByAttributeValue("class","data");

        tableElements.forEach(tableElement->{
            Element thElement = tableElement.child(0);
            String url = thElement.attr("td:class");
            String title = tableElement.child(0).text();
            articleList.add(new Article(url, title));
        });
        articleList.forEach(System.out::println);*/
        Elements tableElements = doc.getElementsByTag("tr");
        tableElements.forEach(tableElement -> {
            String NumCode = tableElement.child(0).text();
            String LetCode = tableElement.child(1).text();
            String SumToChange = tableElement.child(2).text();
            String Currency = tableElement.child(3).text();
            String Course = tableElement.child(4).text();
            tableList.add(new Table(NumCode, LetCode, SumToChange, Currency, Course));
        });
        File f1=new File("\\java\\MyFile1.xls");
        f1.createNewFile();
        if (f1.exists()) {
            System.out.println("Создан!!!!");
            System.out.println("Полный путь1: "+ f1.getAbsolutePath());
        }
        tableList.forEach(System.out::println);
        tableList.forEach(out::println);
        out.flush();}
   /* static class Article{
        private String url;
        private String name;

        public Article(String url, String name) {
            this.url = url;
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Article{" +
                    "url='" + url + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }*/
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
                return "Table{" +
                        "NumCode='" + NumCode + '\'' +
                        ", LetCode='" + LetCode + '\'' +
                        ", SumToChange='" + SumToChange + '\'' +
                        ", Currency='" + Currency + '\'' +
                        ", Course='" + Course + '\'' +
                        '}';
            }
        }
    }

