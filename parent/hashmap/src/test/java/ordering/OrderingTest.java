package ordering;

import order.Order;
import org.junit.jupiter.api.Test;

public class OrderingTest {

    private final Order order = new Order();

    @Test
    public void testOrderHash(){
        order.orderingHash();
    }

    @Test
    public void testOrderLinked(){
        order.orderingLinked();
    }

    @Test
    public void testOrderTree(){
        order.orderingTree();
    }
}
