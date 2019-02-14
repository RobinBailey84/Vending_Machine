package Coins;

public class Coin {

    private CoinType coinType;

    public Coin(CoinType coinType){

        this.coinType = coinType;
    }

    public CoinType getCoinType() {
        return coinType;
    }

    public int coinValue(){
        return this.coinType.getValue();
    }
}
