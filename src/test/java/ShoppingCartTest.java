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
    }
}