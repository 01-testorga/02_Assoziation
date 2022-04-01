package com.cc.java;

public class Customer {
    private int id;
    private String name; 
    private String city;

    public Customer(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;

        Helper.ausgabe(this);
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public int getId() {
        return id;
    }

    
}