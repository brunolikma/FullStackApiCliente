package br.com.cadastro.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
    Connection conn = null;
    String url = "jdbc:mariadb://localhost:3306/brunodb";
    String user = "root";
    String senha = "";

    public Connection getConnection(){
        if(conn == null){
            try {
                conn = DriverManager.getConnection(url,user,senha);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return conn;
        }
        else return conn;
    }

}
