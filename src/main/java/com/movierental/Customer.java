package com.movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
  private String name;
  private Rentals rentals = new Rentals();

  public Customer(String name) {
    this.name = name;
  }

  public void addRental(Rental arg) {
    rentals.add(arg);
  }

  public String getName() {
    return name;
  }

  public String statement() {
    return new TextStatement().display(rentals, getName());
  }



  public String htmlStatement() {

    String result = "<h1>Rental Record for <b>" + getName() + "</b></h1></br>";
    for (Rental each : rentals) {
      //show figures for this rental
      result += each.getMovie().getTitle() + " " +
              String.valueOf(each.amount()) + "</br>";
    }
    result += "Amount owed is <b>" + String.valueOf(rentals.totalAmount()) + "</b></br>";
    result += "You earned <b>" + String.valueOf(rentals.totalFrequentRenterPoints())
            + "</b> frequent renter points";
    return result;
  }
}

