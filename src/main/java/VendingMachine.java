import Coins.Coin;
import Slots.Slots;

import java.util.ArrayList;

public class VendingMachine {

    private int vendingTill;
    private ArrayList<Slots> slots;
    private ArrayList<Coin> coins;

    public VendingMachine(int vendingTill) {
        this.vendingTill = vendingTill;
        this.slots = new ArrayList<Slots>();
        this.coins = new ArrayList<Coin>();
    }

    public int getTillValue() {
        return this.vendingTill;
    }

    public int countSlots() {
        return this.slots.size();
    }

    //check coin is valid
    //take in a coin
    //if coin value > 2 add coin array
    //if not void
    public void checkValidCoin(Coin coin){
        if(coin.coinValue() > 2){
            this.coins.add(coin);
        }
    }


    public int countCoins() {
        return this.coins.size();
    }
}
