import Coins.Coin;
import Coins.CoinType;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VendingMachineTest {
    
    VendingMachine vendingMachine;
    Coin coin;
    Coin coin2;

    @Before
    public void before(){
        vendingMachine = new VendingMachine(10000);
        coin = new Coin(CoinType.FIFTYPENCE);
        coin2 = new Coin(CoinType.TWOPENCE);
    }

    @Test
    public void hasTill() {
        assertEquals(10000, vendingMachine.getTillValue());
    }

    @Test
    public void checkArrayIsEmpty() {
        assertEquals(0, vendingMachine.countSlots());
    }

    @Test
    public void testVendingMachineAcceptsCoins() {
        vendingMachine.checkValidCoin(coin);
        vendingMachine.checkValidCoin(coin2);
        assertEquals(1, vendingMachine.countCoins());
    }
}
