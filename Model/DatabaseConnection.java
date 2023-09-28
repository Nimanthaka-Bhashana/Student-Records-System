/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author niman
 */
public class DatabaseConnection {
    static Connection con;
    public static Connection addConnection()
    {
        try{
        String dbpath="jdbc:mysql://localhost/studentmanagementsystem";
        con=DriverManager.getConnection(dbpath,"root","");
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,"CONNECTION fAIL","Warniing",JOptionPane.WARNING_MESSAGE);
            
        }
        return con;
    }
}
