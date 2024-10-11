package com.example;

public class ItemState {
    private int state;
    public ItemState(int price){
        this.state=price;
    }

    public int getState(){return this.state;}

    public void setState(int state){this.state=state;}

}
