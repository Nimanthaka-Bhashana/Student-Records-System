/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.sql.*;
import Model.MStudentManage;
/**
 *
 * @author niman
 */
public class Cstudentmanage {
    
    ResultSet rst;
    public ResultSet viewStudentData()
    {
        MStudentManage student=new MStudentManage();
        rst=student.viewStudentData();
        
        
        return rst;
        
    }
     public void updateStudentData(int Sid,String Name,String Email,String Address,String Course,int Tel,String R_Date)
     {
         MStudentManage Student=new MStudentManage();
         Student.updateStudentData(Sid, Name, Email, Address, Course, Tel, R_Date);
     }
     
     public void deleteStudent(int Sid)
     {
         
         MStudentManage student=new MStudentManage();
         student.deleteStudent(Sid);
         
     }
}


