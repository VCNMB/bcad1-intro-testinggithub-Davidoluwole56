package com.mycompany.prjclasses;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public class Student {
   private String strStudentName, strStudentCourse;
    private double dblSudentAverage;
public void setName(String strName){
    strStudentName = strName;
}
public String getName(){
  return strStudentName;    
}
public void setCourse(String strCourse){
    strStudentCourse = strCourse;
   
}   

public String getCours(){
    return strStudentCourse;
}
public void setAverage(double dblAverage){
       
    dblSudentAverage = dblAverage; 
    
   
}
public double getAverage(){
    return (dblSudentAverage +(dblSudentAverage * + 0.10));
    
}


}
