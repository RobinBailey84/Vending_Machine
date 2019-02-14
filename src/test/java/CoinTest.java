import Coins.Coin;
import Coins.CoinType;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CoinTest {

   Coin coin;

    @Before
    public void setup(){
        coin = new Coin(CoinType.FIFTYPENCE);
    }

    @Test
    public void canGetCoinType() {
        assertEquals(CoinType.FIFTYPENCE, coin.getCoinType());
    }

    @Test
    public void coinHasValue() {
        assertEquals(50, coin.coinValue());
    }
}
