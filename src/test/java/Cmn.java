import com.jayway.restassured.response.Response;

import java.util.List;
import java.util.Map;

public class Cmn {
    public static Map getItemByName(Response response, String itemName) {
        List<Map> items = response.jsonPath().get();
        return items.stream().filter(item -> item.get("name").equals(itemName)).findFirst().get();
    }
}
