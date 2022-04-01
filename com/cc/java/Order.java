package com.cc.java;

public class Order {
    
    private int orderID;
    private String orderType;
    private boolean isFinished;

    
    public Order(int orderID, String orderType, boolean isFinished) {
        this.orderID = orderID;
        this.orderType = orderType;
        this.isFinished = isFinished;
    }


    public int getOrderID() {
        return orderID;
    }
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }


    public String getOrderType() {
        return orderType;
    }
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }


    public boolean isFinished() {
        return isFinished;
    }
    public void setFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }

    

}
