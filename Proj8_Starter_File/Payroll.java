/**
* PayrollApp.java
* Alex Masson / Thursday / 4:30
*
* <The Payroll class stores data about an employee's pay*/

/**
This file provided to the student for modification
The Payroll class stores data about an employee's pay
*/
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Payroll
{  private String name;          // Employee name
   private int idNumber;         // 6-digit ID number
   private double payRate;       // Hourly pay rate
   private double hoursWorked;   // Number of hours worked
   DecimalFormat formatter = new DecimalFormat("#.00");
   //DecimalFormat format = new DecimalFormat("#.00");

   /**
      The constructor initializes an object with the
      employee's name and ID number.
      @param n The employee's name.
      @param i The employee's ID number.
   */
   public Payroll(String n, int i, double w, double h)
   {
      name = n;
      idNumber = i;
      hoursWorked = w;
      payRate = h;
   }

   /**
      The setName sets the employee's name.
      @param n The employee's name.
   */
   public void setName(String n)
   {
      name = n;
   }

   /**
      The setIdNumber sets the employee's ID number.
      @param i The employee's ID number.
   */
   public void setIdNumber(int i)
   {
      idNumber = i;
   }

   /**
      The setPayRate sets the employee's pay rate.
      @param p The employee's pay rate.
   */
   public void setPayRate(double p)
   {
      payRate = p;
   }

   /**
      The setHoursWorked sets the number of hours worked.
      @param h The number of hours worked.
   */
   public void setHoursWorked(double h)
   {
      hoursWorked = h;
   }

   /**
      The getName returns the employee's name.
      @return The employee's name.
   */
   public String getName()
   {
      return name;
   }

   /**
      The getIdNumber returns the employee's ID number.
      @return The employee's ID number.
   */
   public int getIdNumber()
   {
      return this.idNumber;
   }

   /**
      The getPayRate returns the employee's pay rate.
      @return The employee's pay rate.
   */
   public double getPayRate()
   {
      return payRate;
   }

   /**
      The getHoursWorked returns the hours worked by the
      employee.
      @return The hours worked.
   */
   public double getHoursWorked()
   {
      return hoursWorked;
   }

   /**
      The getGrossPay returns the employee's gross pay.
      @return The employee's gross pay.
   */
   public double getGrossPay()
   {
      double pay = hoursWorked * payRate;
      return pay;
   }

   /**
* The to string method prints all information about the employee *
* @return A string containing all information about the employee*/
   public String toString(){
     double pay = getGrossPay();
     /*"\n\tEmployee's Pay: $" + totalPay*/
     return ("\n"+"\tEmployee Name: " + name + "\n\tID Number: " + idNumber + "\n\tEmployee's Pay: $" + String.format("%.2f", pay) + "\n ");
   }
} // end class
