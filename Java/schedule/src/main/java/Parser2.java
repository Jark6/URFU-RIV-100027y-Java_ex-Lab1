import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Condition.*;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.Doc;


public class Parser2 {
    public static class Selenium {
        private WebDriver driver;
        private Map<String, Object> vars;
        JavascriptExecutor js;
        @Before
        public void setUp() {
            driver = new ChromeDriver();
            js = (JavascriptExecutor) driver;
            vars = new HashMap<String, Object>();
        }
        @After
        public void tearDown() {
            driver.quit();
        }
        @Test
        public void Selenium() throws IOException {
            driver.get("https://lsy.u6.ru/timessquare/");
            driver.manage().window().setSize(new Dimension(1050, 708));
            driver.findElement(By.id("textfield-1024-inputEl")).sendKeys("COMPACT");
            driver.findElement(By.id("textfield-1025-inputEl")).sendKeys("QWErty123");
            driver.findElement(By.id("datefield-1037-inputEl")).click();
            driver.findElement(By.id("datefield-1037-inputEl")).sendKeys("21May21");
            driver.findElement(By.cssSelector(".x-grid-item-focused > .x-grid-cell-inner")).click();
            driver.findElement(By.id("button-1026-btnIconEl")).click();
            MyHtml=getPage();
        }
    }

    private static Document MyHtml;

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
        setUp();
        System.out.println(MyHtml);
    }
}
