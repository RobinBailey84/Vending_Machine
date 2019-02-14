package Slots;

import Products.Products;

import java.util.ArrayList;

public abstract class Slots {

    private String slotNumber;
    private ArrayList<Products> products;

    public Slots(String slotNumber) {
        this.slotNumber = slotNumber;
        this.products = new ArrayList<Products>();
    }

    public int getProductsSize() {
        return this.products.size();
    }

    public String getSlotNumber(){
        return this.slotNumber;
    }
}
