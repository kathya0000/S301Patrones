package com.S301N2Ex1;

public class SpainAddress implements Address {
    private String address;


    public SpainAddress(String address) {
        this.address = address;

    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String getCountry() {

        return "España";
    }
}

