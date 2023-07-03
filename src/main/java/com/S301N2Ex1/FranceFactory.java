package com.S301N2Ex1;

public class FranceFactory implements AbstractFactory {
    @Override
    public Address createAddress(String address) {
        return new FranceAddress(address);
    }

    @Override
    public PhoneNumber createPhoneNumber(String phoneNumber) {
        return new FrancePhoneNumber(phoneNumber);
    }
}
