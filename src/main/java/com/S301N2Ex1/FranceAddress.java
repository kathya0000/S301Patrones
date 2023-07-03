package com.S301N2Ex1;

public class FranceAddress implements Address {
    private String address;

    public FranceAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String getCountry() {
        return "Francia";
    }
}
