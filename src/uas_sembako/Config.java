/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_sembako;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pande aditya
 */
public class Config {
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
             try {
        String url = "jdbc:mysql://localhost:3306/logindata";
        String user = "root";
        String password = "";
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        mysqlconfig = DriverManager.getConnection(url, user, password);
        }catch (Exception e){
           System.err.println("Error"+e.getMessage());
       }
   
     
    
        return mysqlconfig;
}
}
