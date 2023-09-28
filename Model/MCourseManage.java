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
public class MCourseManage {
    public void addCourse(String Cname,int Cfee,int Cduration)
    {
       try{
        Statement st1=DatabaseConnection.addConnection().createStatement();
        int countrow=st1.executeUpdate("INSERT INTO course(Cname,Cduration,Cfee) VALUES('"+Cname+"','"+Cduration+"','"+Cfee+"')");
        if(countrow > 0)
        {
            JOptionPane.showMessageDialog(null,"Course  inserted Successfully ", "Information",JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Course already exists","Error",JOptionPane.ERROR_MESSAGE);
            
            
        }  
        
        
    }
    
    //get data course
    ResultSet rst;
    public ResultSet viewCourse()
    {
         try{
            Statement st=DatabaseConnection.addConnection().createStatement();
            rst=st.executeQuery("SELECT * FROM course");
             
      
            }
            
        
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Please Check Sqlquery");
            
        }
       return rst;
        
    }
    public void deleteCourse(String Cname)
    {
        
        try{
        Statement st1=DatabaseConnection.addConnection().createStatement();
        st1.executeUpdate("DELETE FROM course WHERE Cname='"+Cname+"'");
        JOptionPane.showMessageDialog(null,"Deleted Sucessfully","info",JOptionPane.INFORMATION_MESSAGE);
        
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Invalid Sql Query","Error",JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
    public void updateCourse(String Cname,int Cfee,int Cduration)
    {
         try{
        Statement update=DatabaseConnection.addConnection().createStatement();
       update.executeUpdate("Update course SET Cname='"+Cname+"',Cduration='"+Cduration+"',Cfee='"+Cfee+"' WHERE Cname='"+Cname+"'");
        

        
            JOptionPane.showMessageDialog(null,"Updated Successfully","Information",JOptionPane.INFORMATION_MESSAGE);
            
        
        
        }
        catch(SQLException e)
        {
            
           JOptionPane.showMessageDialog(null,"Invalid Sql Query","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }
}
