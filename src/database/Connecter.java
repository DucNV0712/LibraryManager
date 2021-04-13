package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connecter {
    public final static String connectString = "jdbc:mysql://localhost:3306/librarymanager";
    public final static String username = "root";
    public final static String password = "";
    public Statement statement;
    private static Connecter instance;
    private Connecter(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectString, username, password);
            Statement stt = conn.createStatement();
            statement  = stt;


        } catch (ClassNotFoundException | SQLException cn){
            System.out.println("Class not found");
        }
    }
    public static Connecter getInstance(){
        if(instance == null){
            instance = new Connecter();
        }
        return instance;
    }
    public  Statement getStatement(){
        return statement;
    }


}
