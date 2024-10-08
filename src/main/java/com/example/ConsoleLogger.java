package com.example;

import com.example.LoggerRequest.LoggerType;

public class ConsoleLogger extends Logger {
    
    @Override
    public void log(LoggerRequest request) {
        if(request.getLoggerType()==LoggerType.CONSOLE){
            System.out.println("Request is handled by Console Logger!");
            System.out.println(request.getMessage());
        }else{
            this.getNextHandler().log(request);
        }
    }


}
