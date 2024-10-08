package com.example;

public class TableRoom extends RoomDecorator{
  public TableRoom(Room basicRoom){
    super(basicRoom);
  }
  @Override
  public void printFurniture(){
    super.printFurniture();
    System.out.println("Table");
  }
}
