package inmvipi.Conex_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conex_DB { 
    Connection conectar = null;  
    public Connection Conexion(){     
        try{         
            Class.forName("java.sql.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost","root","");
            System.out.println("conexion exitosa!");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "error en conexion: " + e.getMessage());
        }
        return conectar;
    }    
}