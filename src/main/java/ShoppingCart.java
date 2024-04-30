import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Double> items = new HashMap<>();
    private double discountPercentage;

    public void addItem(String item, Double price) {
        items.put(item, price);
    }

    public Map<String, Double> getItems() {
        return items;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public double calculatePrice(Map<String, Double> input) {
        double totalPrice = 0;
        for (Map.Entry<String, Double> entry : input.entrySet()) {
            totalPrice += entry.getValue();
        }
        return totalPrice;
    }

    public void applyDiscount(double percentage) {
        this.discountPercentage = percentage;
    }
}
