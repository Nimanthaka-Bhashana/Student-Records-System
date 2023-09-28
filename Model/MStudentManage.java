/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import View.ManageStudent;
import java.sql.*;
import javax.swing.*;


/**
 *
 * @author niman
 */
public class MStudentManage  {
    
    ResultSet rst;
    public ResultSet viewStudentData()
    {
        try{
            Statement st=DatabaseConnection.addConnection().createStatement();
            rst=st.executeQuery("SELECT * FROM student");
             
      
            }
            
        
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Please Check Sqlquery");
            
        }
       return rst;
    }
    public void updateStudentData(int Sid,String Name,String Email,String Address,String Course,int Tel,String R_Date)
    {
        try{
        Statement update=DatabaseConnection.addConnection().createStatement();
       update.executeUpdate("Update student SET Sname='"+Name+"',Email='"+Email+"',Address='"+Address+"',Course='"+Course+"',Telephone='"+Tel+"',Dob='"+R_Date+"' WHERE Sid='"+Sid+"'");
        

        
            JOptionPane.showMessageDialog(null,"Updated Successfully","Information",JOptionPane.INFORMATION_MESSAGE);
            
        
        
        }
        catch(SQLException e)
        {
            
           JOptionPane.showMessageDialog(null,"Invalid Sql Query","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
    
    public void deleteStudent(int Sid)
    {
        try{
        Statement st1=DatabaseConnection.addConnection().createStatement();
        st1.executeUpdate("DELETE FROM student WHERE Sid='"+Sid+"'");
        JOptionPane.showMessageDialog(null,"Deleted Sucessfully","info",JOptionPane.INFORMATION_MESSAGE);
        
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Invalid Sql Query","Error",JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
}
