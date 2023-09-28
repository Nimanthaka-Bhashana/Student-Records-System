/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.MNewStudentRegister;
import java.sql.*;
/**
 *
 * @author niman
 */
public class CNewStudentRegister {
    ResultSet rst;
     public void addStudent(String Name,String Email,String Address,String Course,int Tel,String R_Date)
     {
         
         MNewStudentRegister st1=new MNewStudentRegister();
         st1.addStudent(Name, Email, Address, Course, Tel, R_Date);
     }
    public ResultSet addCourse()
    {
        
        MNewStudentRegister course=new MNewStudentRegister();
        course.addCourse();
        return rst;
    }
     }
     

