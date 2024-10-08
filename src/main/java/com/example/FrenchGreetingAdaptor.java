package com.example;

public class FrenchGreetingAdaptor implements LocalizedMessage{
  private final FrenchLocalizedMessage frenchLocalizedMessage;

  public FrenchGreetingAdaptor(){
    this.frenchLocalizedMessage=new FrenchLocalizedMessage();
  }

  @Override
  public void sayHello(){
    frenchLocalizedMessage.sayBonjour();
  }

}
