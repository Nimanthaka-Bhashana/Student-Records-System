/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.MCourseManage;
import java.sql.*;
/**
 *
 * @author niman
 */
public class CCourseManage {
    ResultSet rst;
    public void addCourse(String Cname,int Cfee,int Cduration)
     {
         MCourseManage course=new MCourseManage();
         course.addCourse(Cname, Cfee, Cduration);
        
    }
    public ResultSet viewCourse()
    {
        MCourseManage C=new MCourseManage();
        ResultSet rst=C.viewCourse();
        
        return rst;
    }
    
    public void deleteCource(String  Cname)
    {
        
        MCourseManage course=new MCourseManage();
           course.deleteCourse(Cname);
        
    }
    
    public void updateCourse(String Cname,int Cfee,int Cduration)
    {
        MCourseManage update1=new MCourseManage();
        update1.updateCourse(Cname,Cfee,Cduration);

        
        
    }
}
