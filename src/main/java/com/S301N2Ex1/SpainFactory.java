package com.S301N2Ex1;

public class SpainFactory implements AbstractFactory{
    @Override
    public Address createAddress(String address) {
        return new SpainAddress(address);
    }

    @Override
    public PhoneNumber createPhoneNumber(String phoneNumber) {
        return new SpainPhoneNumber(phoneNumber);
    }
}

