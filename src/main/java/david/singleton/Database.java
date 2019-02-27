package main.java.david.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    private static Database dbIsntance;
    private static Connection con ;


    private Database() {
      // private constructor //
    }

    public static Database getInstance(){
    if(dbIsntance==null){
        dbIsntance= new Database();
    }
    return dbIsntance;
    }

    public  Connection getConnection(){

        if(con==null){
            try {
                String host = "jdbc:derby://localhost:1527/singleton-pattern";
                String username = "DavidMamani";
                String password = "<[:)]/>";
                con = DriverManager.getConnection( host, username, password );
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return con;
    }
    public String query(String sql) {
    	return "DB result";
    }
}