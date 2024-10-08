package com.example;

public abstract class ATM {
    private final ATM nextHandler;
    public ATM(ATM nextHandler){
        this.nextHandler=nextHandler;
    }
    public ATM getNextHandler(){
        return this.nextHandler;
    }
    public abstract void dispense(WithdrawalRequest request);

}
