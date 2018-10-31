package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

  public static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
  public static final String JDBC_URL = "jdbc:derby:DerbyDemo;";

  Connection conn;

  public DBConnection() {
    try {
      this.conn = DriverManager.getConnection(JDBC_URL);
      if (this.conn != null) {
        System.out.println("Connected!");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void createTable() {

    try {
      conn.createStatement()
          .execute("Create TABLE MyTable (Name varchar(50),Age INT,Gender char(1))");
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

  public void insertIntoTable(String name, int age, char gender) {
    try {
      conn.createStatement()
          .execute("INSERT INTO Mytable VALUES ('" + name + "'," + age + ",'" + gender + "')");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void printAll() {

    try {
      Statement statement = this.conn.createStatement();
      ResultSet res = statement.executeQuery("SELECT * FROM Mytable");
      while (res.next()) {
        System.out.println(
            res.getString("Name") + " " + res.getString("Age") + " " + res.getString("Gender"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

}
