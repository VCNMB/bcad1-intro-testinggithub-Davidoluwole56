/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses5;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class PrjClasses5 {

    public static void main(String[] args) {
       String strName = JOptionPane.showInputDialog(null, "Please enter your Name:");
       double dblTime = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the number of hours spoken for:"));
       double dblPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the number Price per minute:"));
       
       Bill b = new Bill(strName, dblTime, dblPrice);
       
      JOptionPane.showMessageDialog(null, "Name:  \n" + b.getName() + "\n" + "Price R" + b.getPrice() );
        
    }
}
