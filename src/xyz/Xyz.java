/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xyz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Xyz {

    String bd = "kd-electronics";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;

    public Xyz(String bd) {
        this.bd = bd;
    }

    private Xyz() {

    }

    public Connection conectar() throws SQLException {
        try {
            Class.forName(driver);
            // cadena de Conexion
            cx = DriverManager.getConnection(url + bd, user, password);
            System.out.println("Se conectó a BD " + bd);
        } catch (ClassNotFoundException ex) {
            System.out.println("No se conectó a BD: " + bd);
        }
        return cx;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
