package com.mushroom;

public class Rec {
    private int id;
    private String firstName;
    private String lastName;
    private String address;

    private static int counter = 1;

    public Rec() {
        this.id = counter++;
    }

    public Rec(String firstName, String lastName, String address) {
        this.id = counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
