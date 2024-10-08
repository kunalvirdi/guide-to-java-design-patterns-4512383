package com.example;
class CouchRoom extends RoomDecorator{

  public CouchRoom(Room basicRoom){
    super(basicRoom);
  }
  @Override
  public void printFurniture(){
    super.printFurniture();
    System.out.println("Couch");
  }
}