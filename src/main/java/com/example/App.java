package com.example;

public class App {
    private static ConsoleLogger consoleLogger;
    private static FileLogger fileLogger;
    public static void main(String[] args) {

        var message = "Hello World";
        var request = new LoggerRequest(message, LoggerRequest.LoggerType.FILE);
        configure();
        consoleLogger.log(request);
        
    }
    public static void configure(){
        consoleLogger=new ConsoleLogger();
        fileLogger=new FileLogger();
        consoleLogger.setNextHandler(fileLogger);

    }

}
