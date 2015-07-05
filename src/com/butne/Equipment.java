package com.butne;

/**
Equipment class
 */
public class Equipment {

    protected String name;

    /*
     These stats are represented as an array since we have three different stats, one for each
     set of "dice": Green, Blue, Red
     */
    protected int attack [];
    protected int skill [];
    protected int intelligence[];
    protected int mind [];

    public Equipment(String name) {
        this.name = name;
    }
}
