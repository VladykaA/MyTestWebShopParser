import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveToJSON {

    public static void writeJSON(List<Product> list){
        Gson gson = new Gson();
        try {
            String jsonString = gson.toJson(list);
            FileWriter writer = new FileWriter("D:\\Learning\\MyTestWebShopParser\\example.json");
            writer.write(jsonString);
            writer.close();
        } catch (IOException e) {
            System.out.println("exception " + e.getMessage());
            e.printStackTrace();
        }





    }
}
