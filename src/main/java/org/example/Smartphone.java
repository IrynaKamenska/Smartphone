package org.example;

import java.util.ArrayList;

public class Smartphone implements Radio, GPS {
    private String model;
    private String manufacter;
    private ArrayList<Contact> allContacts;


    // Konstruktor
    public Smartphone() {
    }


    // Methoden - Getter und Setter


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacter() {
        return manufacter;
    }

    public void setManufacter(String manufacter) {
        this.manufacter = manufacter;
    }

    public ArrayList<Contact> getAllContacts() {
        return allContacts;
    }

    public void setAllContacts(ArrayList<Contact> allContacts) {
        this.allContacts = allContacts;
    }


    public void addContact(Contact contact) {
        allContacts.add(contact);

    }

    public Contact getContact(int index) {
        return allContacts.get(index);

    }

    public Contact getContactByName(String name){
        String conName;
        for (Contact c : allContacts ) {
            conName = c.getName().toString();
            if(name.equals(conName)){
                return c;
            }
        }
        throw new RuntimeException("Kontakt mit der Name: " + name + " wurde nicht gefunden");
    }

    public boolean removeContactByName(String name){
        String conName;
        for (Contact c : allContacts ) {
            conName = c.getName().toString();
            if(name.equals(conName)){
                System.out.println("Kontakt mit der Name: " + name + " wurde entfernt");
                return allContacts.remove(c);
            }
        }
        throw new RuntimeException("Kontakt mit der Name: " + name + " konnte nicht enfernt werden");
    }


    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", manufacter='" + manufacter + '\'' +
                ", allContacts=" + allContacts +
                '}';
    }

    // Überschriebene Methoden
    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public String startRadio() {
        return "Radio started";
    }

    @Override
    public String stopRadio() {
        return "Radio stopped";
    }


}
