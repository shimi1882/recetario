/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conexion {
    public String db = "recetario";
    public String url = "jdbc:mysql://localhost/"+db;
    public String usuario = "root";
    public String pws = "";
    
public void conexion () {
    
}

 public Connection Conectar (){ 
       Connection liga = null;
       try {
           Class.forName("com.mysql.jdbc.Driver");
           liga = (Connection) DriverManager.getConnection(url, usuario, pws);
       } catch (ClassNotFoundException | SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);
       }
return liga;
}
}