import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftcardTest {

    Giftcard giftcard;

    @Before
    public void before(){
        giftcard = new Giftcard(30.00);
    }

    @Test
    public void reducesBalance() {
        assertEquals(20.00, giftcard.reduce(10.00), 0);
    }


}
