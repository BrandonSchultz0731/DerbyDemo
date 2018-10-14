package com.company;


public class Main {

    public static void main(String[] args) {

        DBConnection db = new DBConnection();
        db.createTable();
        db.insertIntoTable("Brandon",21,'M');
        db.insertIntoTable("John",25,'M');
        db.printAll();

    }
}
