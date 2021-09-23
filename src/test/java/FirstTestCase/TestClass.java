package FirstTestCase;

import org.junit.Test;

public class TestClass extends TestBase {

@Test
    public void userCanSendOrder() {
        openURL();
        restSelect();
        mathRandomHead();
        pickRandCards();
        goBasket();
        fillInFields();
        selectPayType();
        sendOrder();
        waitForComplete();



    }


}