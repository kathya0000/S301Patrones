package com.S301N2Ex1;

public class FrancePhoneNumber implements PhoneNumber {
    private String phoneNumber;

    public FrancePhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}

