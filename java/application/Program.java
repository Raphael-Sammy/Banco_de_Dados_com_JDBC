package application;

import db.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {
        Connection conn = DB.getConnection();
        DB.closeConnection();
        if(DB.getConnection() != null){
            System.out.println("Conectado ao servidor");
        }
    }
}
