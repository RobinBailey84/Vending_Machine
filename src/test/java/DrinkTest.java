import Products.Products;
import Products.Drink;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DrinkTest {

    Drink drink;

    @Before
    public void setup(){
        drink = new Drink(120, "Coke");
    }

    @Test
    public void drinkHasValue() {
        assertEquals(120, drink.getProductValue());
    }

    @Test
    public void drinkHasName() {
        assertEquals("Coke", drink.getProductName());
    }
}
