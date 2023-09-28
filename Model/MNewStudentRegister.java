/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
/**
 *
 * @author niman
 */
public class MNewStudentRegister {
    public void addStudent(String Name,String Email,String Address,String Course,int Tel,String R_Date)
    {
        try{
        Statement st1=DatabaseConnection.addConnection().createStatement();
        int countrow=st1.executeUpdate("INSERT INTO student(Sname,Email,Address,Course,Telephone,Dob) VALUES('"+Name+"','"+Email+"','"+Address+"','"+Course+"','"+Tel+"','"+R_Date+"')");
        if(countrow > 0)
        {
            JOptionPane.showMessageDialog(null,"Student Data  inserted Successfully ", "Information",JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
            
            
        }
        catch(NullPointerException e2)
        {
            
            JOptionPane.showMessageDialog(null," please fill all fields", "Error",JOptionPane.INFORMATION_MESSAGE);
            
            
        }
        catch(NumberFormatException e3)
            
        {
            JOptionPane.showMessageDialog(null," Please enter valid values", "Error",JOptionPane.INFORMATION_MESSAGE);
            
            
            
            
        }
    }
    ResultSet rst;
    public ResultSet addCourse()
    {
        try{
            Statement st=DatabaseConnection.addConnection().createStatement();
            rst=st.executeQuery("SELECT *  FROM course");
             
      
            }
            
        
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Please Check Sqlquery");
            
        }
       return rst;
    }
}

