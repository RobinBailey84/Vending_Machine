package Slots;

import Products.Products;

import java.util.ArrayList;

public class Slot2 extends Slots {

    private ArrayList<Products> products;

    public Slot2(String slotNumber) {
        super(slotNumber);
        this.products = new ArrayList<Products>();
    }
}
