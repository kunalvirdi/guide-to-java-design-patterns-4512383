package com.example;

import com.example.WithdrawalRequest.Currency;

public class EuroATM extends ATM {
    public EuroATM(ATM nextHandler){
        super(nextHandler);
    }
    @Override
    public void dispense(WithdrawalRequest request) {
        if(request.getCurrency()==Currency.EUR){
            System.out.println("Dispensing €" + request.getAmount());
        }else if(this.getNextHandler()!=null){
            System.out.println("Transferring to USD ATM.....");
            try{
                Thread.sleep(3000);
            }catch(Exception e){

            }
            this.getNextHandler().dispense(request);
        }
    }
}
