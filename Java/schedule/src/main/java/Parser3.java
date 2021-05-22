import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.gargoylesoftware.htmlunit.*;



public class Parser3 {
    private Document doc1;
    private Thread secThread;
    private Runnable runnable;

    private void init(){
    runnable = new Runnable() {
        @Override
        public void run() {
            try {
                getWeb();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    };
        secThread = new Thread(runnable);
        secThread.start();
    }
    private void getWeb() throws IOException {
        doc1 = Jsoup.connect("https://lsy.u6.ru/timessquare/").get();
    }
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
