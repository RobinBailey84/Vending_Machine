package Products;

import Behaviours.IProductName;
import Behaviours.IValue;

public abstract class Products implements IProductName, IValue {

    private int productValue;
    private String productName;

    public Products(int productValue, String productName) {
        this.productValue = productValue;
        this.productName = productName;
    }

    public int getProductValue() {
        return this.productValue;
    }

    public String getProductName() {
        return this.productName;
    }
}
