package com.example;

public class House {

    public static void main(String[] args) {

        var room = new BasicRoom();
        room.printFurniture();

        System.out.println();

        // create a room with a carpet and a couch
        var couchRoom=new CouchRoom(room);
        couchRoom.printFurniture();

        System.out.println();
        var tableRoom=new TableRoom(couchRoom);
        tableRoom.printFurniture();
        // create a room with a carpet, a couch and a table

    }

}
