package Coins;

public enum CoinType {
    ONEPENCE(1),
    TWOPENCE(2),
    FIVEPENCE(5),
    TENPENCE(10),
    TWENTYPENCE(20),
    FIFTYPENCE(50),
    ONEPOUND(100),
    TWOPOUND(200);

    private final int value;

    CoinType(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
