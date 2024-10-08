package com.example;

public class App {
    private static ATM euroAtm,usdAtm;
    public static void main(String[] args) {
        var request = new WithdrawalRequest(20, WithdrawalRequest.Currency.USD);
        configure();
        euroAtm.dispense(request);

    }
    private static void configure(){
        usdAtm=new UsDollarATM(null);
        euroAtm=new EuroATM(usdAtm);
    }

}
