package com.example;

public abstract class Logger {
    private Logger nextHandler;

    public void setNextHandler(Logger nextHandler){
        this.nextHandler=nextHandler;
    }
    public Logger getNextHandler(){ return this.nextHandler;}
    public abstract void log(LoggerRequest request);

}
