package com.mycompany.prjclasses5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public class Bill {
    private String strName;
    private double dblTime;
    double dblPrice;
    
    public Bill(String Name, double Time, double Price){
        strName = Name;
        dblTime = Time;
        dblPrice = Price;
        
        
    }
    public String getName()
    {
        return strName;
    }
    public double getPrice()
    {
     return (dblTime * 60) * dblPrice;   
    }
    
            
    
}
