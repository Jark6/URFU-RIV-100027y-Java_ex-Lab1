import java.io.IOException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Condition.*;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import javax.print.Doc;


public class Parser2 {

    private static Document getPage() throws IOException {
        String url = "https://lsy.u6.ru/timessquare/";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }
    private static Document Connect() throws IOException {
        Document doc = Jsoup.connect("https://lsy.u6.ru/timessquare/")
                .data("query", "Java")
                .userAgent("Chrome")
                .cookie("auth", "token")
                .timeout(3000)
                .data("Login Name:", "COMPACT")
                .data("Password:", "QWErty123")
                //.data("operating AC (57 selections)")
               // .data("Expected date format dMy.","21May21")
               // .dara("<span id=\"button-1026-btnInnerEl\" data-ref=\"btnInnerEl\" unselectable=\"on\" class=\"x-btn-inner x-btn-inner-default-toolbar-small\">&nbsp;</span>")
                .get();



                return getPage();
    }

    private static Pattern pattern = Pattern.compile("\\d{2}\\.\\d{2}");

    private static String getDateFromString(String stringDate) throws Exception {
        Matcher matcher = pattern.matcher(stringDate);
        if (matcher.find()) {
            return matcher.group();
        }
        throw new Exception("Can't extract date from string!");
    }

    public static void main(String[] args) throws IOException {

        System.out.println(Connect());
    }
}
