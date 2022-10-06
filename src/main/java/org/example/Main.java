package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Contact contact1 = new Friend("Alice", "123456");
        Contact contact2 = new Friend("Bob", "654321");

        ArrayList<Contact> contactList = new ArrayList<>(List.of(contact1, contact2));
        System.out.println("Kontakten Liste: " + contactList);

        Smartphone smartphone = new Smartphone("galaxy", "samsung", contactList);
//   smartphone.setAllContacts(list);
        System.out.println("Alle Kontakte:" + smartphone.getAllContacts().toString());

        smartphone.startRadio();
        System.out.println(smartphone.getPosition());
        smartphone.stopRadio();


        Contact buisnessContact = new BuisnessContact("John", "neuefische");
        smartphone.addContact(buisnessContact);
        System.out.println("Alle Kontakte:" + smartphone.getAllContacts().toString());
        System.out.println("Kontakt 1:" + smartphone.getContact(1).toString());

        System.out.println("Gefunden: " + smartphone.getContactByName("Alice").toString());
        boolean removed = smartphone.removeContactByName("Alice");
        System.out.println("Entfernt:" + removed);
        System.out.println("Alle Kontakte:" + smartphone.getAllContacts().toString());
        System.out.println("Test");


    }
}