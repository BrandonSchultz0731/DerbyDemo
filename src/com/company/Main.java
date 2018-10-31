package com.company;


public class Main {

    public static void main(String[] args) {

        DBConnection db = new DBConnection();
        //db.createTable();
        db.insertIntoTable("Freddy",21,'M');
        db.printAll();


    }
}
