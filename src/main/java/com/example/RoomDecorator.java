package com.example;
abstract class RoomDecorator implements Room{
  private final Room basicRoom;

  public RoomDecorator(Room basicRoom){
    this.basicRoom=basicRoom;
  }
  public void printFurniture(){
    basicRoom.printFurniture();
  }
}