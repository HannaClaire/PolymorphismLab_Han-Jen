import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditcard;

    @Before
    public void before(){
        creditcard = new CreditCard(38492846, "02.03.33", 943, 100.00);
    }

    @Test
    public void chargesAnAdditionalFee() {
        assertEquals(50.50, creditcard.charge(50.00), 0);
    }

    @Test
    public void reducesCreditOnCreditCard() {
        assertEquals(49.50, creditcard.reduce(50.00),0);
    }

}
