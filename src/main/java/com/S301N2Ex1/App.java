package com.S301N2Ex1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        do {
            displayMenu();
            String option = scanner.nextLine();

            switch (option.toLowerCase()) {
                case "1":
                    addAddressAndPhoneNumber(addressBook, new SpainFactory(), "Dirección en España: ");
                    break;
                case "2":
                    addAddressAndPhoneNumber(addressBook, new FranceFactory(), "Adresse en France: ");
                    break;
                case "3":
                    addressBook.printAgenda();
                    break;
                case "4":
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                    break;
            }
        } while (!exit);


    }

    private static void displayMenu() {
        System.out.println("**********************************");
        System.out.println("* GESTOR DE DIRECCIONES Y TELÉFONOS *");
        System.out.println("**********************************");
        System.out.println("1. Añadir dirección y teléfono para España");
        System.out.println("2. Añadir dirección y teléfono para Francia");
        System.out.println("3. Ver agenda");
        System.out.println("4. Salir del programa");
        System.out.println("Por favor, selecciona una opción:");
    }

    private static void addAddressAndPhoneNumber(AddressBook addressBook, AbstractFactory factory, String addressPrefix) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce la dirección:");
        String address = scanner.nextLine();

        System.out.println("Por favor, introduce el número de teléfono:");
        String phoneNumber = scanner.nextLine();

        Address newAddress = factory.createAddress(address);
        PhoneNumber newPhoneNumber = factory.createPhoneNumber(phoneNumber);

        addressBook.addAddress(newAddress);
        addressBook.addPhoneNumber(newPhoneNumber);
    }
}

