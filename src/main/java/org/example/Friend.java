package org.example;

public class Friend extends Contact {
    private String telefonNumber;

    public Friend(String name){
        super(name);
    }

    public Friend(String name, String telefonNumber){
        super(name);
        this.telefonNumber = telefonNumber;
    }



    @Override
    public String toString() {
        return "Friend{" +
                "telefonNumber='" + telefonNumber + '\'' +
                "} " + getName();
    }

}
