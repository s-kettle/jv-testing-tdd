import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    @DisplayName("items can be added to cart")
    void addItem() {

        cart.addItem("Bread", 2.00);
        HashMap<String, Double> expectedMap = new HashMap<>() {{ put("Bread", 2.00); }};

        assertEquals(expectedMap, cart.getItems());

    }

    @Test
    @DisplayName("can correctly calculate total price")
    void calculatePrice() {

        cart.addItem("Bread", 2.00);
        cart.addItem("Milk", 1.60);
        cart.addItem("Eggs", 1.80);

        assertEquals(5.40, cart.calculatePrice(cart.getItems()));
    }
}