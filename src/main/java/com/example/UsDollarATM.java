package com.example;

import com.example.WithdrawalRequest.Currency;

public class UsDollarATM extends ATM {
    public UsDollarATM(ATM nextHandler){
        super(nextHandler);
    }
    @Override
    public void dispense(WithdrawalRequest request) {
        if(request.getCurrency()==Currency.USD){
            System.out.println("Dispensing $" + request.getAmount());
        }else if(this.getNextHandler()!=null){
            System.out.println("Transferring to USD ATM.....");
            this.getNextHandler().dispense(request);
        }else{
            System.out.println("Your request for withdrawing the money cannot be fulfilled because there is not any suitable ATM.");
        }
    }


}
