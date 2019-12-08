import java.util.ArrayList;
import java.util.List;

public class Product {

    private String name;
    private String brand;
    private List<String> color = new ArrayList<>();
    private String price;
    private String articleID;

    public Product(String name, String brand, List<String> color, String price, String articleID) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.articleID = articleID;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getArticleID() {
        return articleID;
    }

    public void setArticleID(String articleID) {
        this.articleID = articleID;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", color=" + color +
                ", price='" + price + '\'' +
                ", articleID='" + articleID + '\'' +
                '}';
    }
}
