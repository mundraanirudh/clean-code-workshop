package com.movierental;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Customer customer;
    @Before
    public void setup(){
        customer = new Customer("Anirudh");
        customer.addRental(new Rental(new Movie("Inception",Movie.REGULAR),2));
        customer.addRental(new Rental(new Movie("Mohana",Movie.CHILDRENS),7));
        customer.addRental(new Rental(new Movie("Once upon a time in Hollywood",Movie.NEW_RELEASE),5));
    }
    @Test
    public void testStatement(){

        assertEquals("Rental Record for Anirudh\n" +
                "\tInception\t2.0\n" +
                "\tMohana\t7.5\n" +
                "\tOnce upon a time in Hollywood\t15.0\n" +
                "Amount owed is 24.5\n" +
                "You earned 4 frequent renter points",customer.statement());
    }
    @Test
    public void testHTMLStatement(){

        assertEquals("<h1>Rental Record for <b>Anirudh</b></h1></br>" +
                "Inception 2.0</br>" +
                "Mohana 7.5</br>" +
                "Once upon a time in Hollywood 15.0</br>" +
                "Amount owed is <b>24.5</b></br>" +
                "You earned <b>4</b> frequent renter points",customer.htmlStatement());
    }

}