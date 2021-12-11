package work23_24;

import com.opencsv.exceptions.CsvException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, CsvException {
        //Task 1
//        try (CSVReader reader = new CSVReader(new FileReader("C://Users//zubko//IdeaProjects//JavaUniversityMaven//src//main//java" +
//                "//task23_24//prices.csv"))) {
//            List<String[]> r = reader.readAll();
//            r.forEach(x -> System.out.println(x[0] + ", " + x[1] + ", " + x[2] + " " + x[3] + ", " + x[4]));
//        }

        //Task 2
        Document document = Jsoup.connect("https://www.mirea.ru/").get();
        Elements list;
        //list = document.getElementsByClass("uk-text-uppercase");
        list = document.getElementsByTag("img");
        for(Element el : list) {
            if( el.attr("src").length() > 0 )
                if (el.attr("src").substring(el.attr("src").length() - 3, el.attr("src").length()).equals("png") |
                        el.attr("src").substring(el.attr("src").length() - 3, el.attr("src").length()).equals("jpg"))
                    System.out.println("https://www.mirea.ru" + el.attr("src"));
        }
    }
}
