package com.movierental;

import java.util.ArrayList;

public class Rentals extends ArrayList<Rental> {
    public int totalFrequentRenterPoints() {
        return this.stream().mapToInt(x -> x.getFrequentRenterPoints()).sum();
    }

    public double totalAmount() {
        return this.stream().mapToDouble(x -> x.amount()).sum();
    }
}
