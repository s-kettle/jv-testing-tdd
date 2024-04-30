import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Double> items = new HashMap<>();

    public void addItem(String item, Double price) {
        items.put(item, price);
    }

    public double calculatePrice(Map<String, Double> input) {
        double totalPrice = 0;
        for (Map.Entry<String, Double> entry : input.entrySet()) {
            totalPrice += entry.getValue();
        }
        return totalPrice;
    }
}
