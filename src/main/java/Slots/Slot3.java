package Slots;

import Products.Products;

import java.util.ArrayList;

public class Slot3 extends Slots {

    private ArrayList<Products> products;

    public Slot3(String slotNumber) {
        super(slotNumber);
        this.products = new ArrayList<Products>();
    }
}
