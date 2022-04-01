package com.cc.java;

public class Customer {
    private int id;
    private String name; 
    private String city;

    private Order order;

    public Customer(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;


    }

    // assoziation
    public void initOrder(){
        order = new Order(1,"Repair");
    }

    public void removeOrder(){
        order = null;
    }



    //getter
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public int getId() {
        return id;
    }
    public Order getOrder() {
        return order;
    }

    
    // setter
    public void setId(int id) {
        this.id = id;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOrder(Order order) {
        this.order = order;
    }    
}
