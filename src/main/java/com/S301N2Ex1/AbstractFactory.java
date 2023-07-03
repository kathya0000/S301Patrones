package com.S301N2Ex1;

public interface AbstractFactory {
    public abstract Address createAddress(String address);
    public abstract PhoneNumber createPhoneNumber(String phoneNumber);
}
