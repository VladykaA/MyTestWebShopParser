import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Product> productList = new ArrayList<Product>();

        Document document = Jsoup.connect("https://www.aboutyou.de/maenner/bekleidung")
                .userAgent("Chrome/78.0.3904.108")
                .referrer("http://www.google.com")
                .get();

        Elements elements = document.getElementsByClass("sc-1qheze-0 iqQUjr");

        elements.forEach(element ->{
            String brand = element.select("p").attr("data-test-id","BrandName").text();

            String name = element.select("a").attr("data-test-id","ProductTile").attr("href");

            String price = element.getElementsByClass("sc-137x7zs-0 x3voc9-0 ddcEYK").text();

            String articleId = element.select("a").attr("data-test-id","ProductTile").attr("id");

            Elements colorList = element.select("li").attr("data-test-id","ColorBubble");

            ArrayList<String> productColors = new ArrayList<>();
            colorList.forEach(colors ->{
                productColors.add(colors.attr("color"));
            });
            productList.add(new Product(name, brand, productColors, price, articleId));
        });

        SaveToJSON.writeJSON(productList);
        //productList.forEach(System.out::println);
    }
}
