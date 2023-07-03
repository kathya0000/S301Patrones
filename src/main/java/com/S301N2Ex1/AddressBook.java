package com.S301N2Ex1;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Address> addresses;
    private List<PhoneNumber> phoneNumbers;

    public AddressBook() {
        addresses = new ArrayList<>();
        phoneNumbers = new ArrayList<>();
    }

    public void addAddress(Address address) {

        addresses.add(address);
    }

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    public void printAgenda() {
        System.out.println("Agenda:");
        int size = addresses.size(); // Obtenemos el tamaño de la lista de direcciones
        for (int i = 0; i < size; i++) {
            Address address = addresses.get(i);
            PhoneNumber phoneNumber = phoneNumbers.get(i);

            System.out.println("País: " + address.getCountry());
            System.out.println("Dirección: " + address.getAddress());
            System.out.println("Número de teléfono: " + phoneNumber.getPhoneNumber());
            System.out.println();
        }
    }
}

