/**
* PayrollApp.java
* Alex Masson / Thursday / 4:30
*
* This prompts the user for information and runs the program */


import java.io.*;
import java.util.*;

public class PayrollApp {
  public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    ArrayList <Payroll> plist = new ArrayList<Payroll>();
    int i = 0;
    int k = 0;
    String reply;
    String name = "";
    int nameSize = 0;
    int number = -1;
    double payRate = -1;
    double hours = -1;
    boolean flag = true;
    boolean flag1 = true;


    do{
      try{
        System.out.print("Enter Employee " + (i+1) + "'s Name: ");
      	name = s.nextLine();
        nameSize = name.length();
          if(nameSize==0) {
            throw new IllegalArgumentException("Please input an Employee ID number");
          }//end if
      } catch(IllegalArgumentException e) {
          while(nameSize==0){
            System.out.println("\tERROR: No employee name entered");
            System.out.print("Enter Employee " + (i+1) + "'s Name: ");
          	name = s.nextLine();
            nameSize = name.length();
          }//end while
      }//end catch

      do{
        try{
    	     System.out.print("\nEnter " + name + "'s ID number: ");
    	      number = Integer.parseInt(s.nextLine());
          }catch(NumberFormatException e){
            System.out.println("\tERROR: Must enter whole numbers for ID");
      }
    }while(number == -1);

    do{
      try{
    	   System.out.print("\nEnter in the Pay Rate for " + name + " (Ex: 9.75): ");
    	    payRate = Double.parseDouble(s.nextLine());
      }catch(NumberFormatException e){
        System.out.println("\tERROR: Must enter a number for " + name + "'s Pay");
      }
    }while(payRate == -1);

    do{
      try{
      System.out.print("\nEnter " + name + "'s hours for the week(Ex: 46.58): ");
    	hours= Double.parseDouble(s.nextLine());
    }catch(NumberFormatException e){
      System.out.println("\tERROR: Must enter a number for " + name + "'s Hours");
    }
  }while(hours == -1);
      plist.add(new Payroll (name, number, hours, payRate));

      name = "";
      nameSize = 0;
      number = -1;
      payRate = -1;
      hours = -1;

    	System.out.print("\nDo you wish to add another? (y/N): ");
    	reply = s.nextLine();
      i++;
    } while (reply.equalsIgnoreCase("y"));

    while(k<plist.size()){
      System.out.println(plist.get(k));
      k++;
    }
    k=0;
    do{
      System.out.print("Enter an ID to delete: ");
      int idDelete = Integer.parseInt(s.nextLine());
      for(int w = 0; w < plist.size(); w++){

        if(plist.get(w).getIdNumber() == idDelete){
          plist.remove(w);
          System.out.println("\tUser removed");
          flag1 = false;
        }
      }
      if(flag1){
        System.out.println("\tUser not found");
      }
    }while(flag1);
    System.out.println("");
    System.out.println("Enter a final employee");
    do{
      try{
        System.out.print("Enter Employee " + (i+1) + "'s Name: ");
      	name = s.nextLine();
        nameSize = name.length();
          if(nameSize==0) {
            throw new IllegalArgumentException("Please input an Employee ID number");
          }//end if
      } catch(IllegalArgumentException e) {
          while(nameSize==0){
            System.out.println("\tERROR: No employee name entered");
            System.out.print("Enter Employee " + (i+1) + "'s Name: ");
          	name = s.nextLine();
            nameSize = name.length();
          }//end while
      }//end catch

      do{
        try{
    	     System.out.print("\nEnter " + name + "'s ID number: ");
    	      number = Integer.parseInt(s.nextLine());
          }catch(NumberFormatException e){
            System.out.println("\tERROR: Must enter whole numbers for ID");
      }
    }while(number == -1);

    do{
      try{
    	   System.out.print("\nEnter in the Pay Rate for " + name + " (Ex: 9.75): ");
    	    payRate = Double.parseDouble(s.nextLine());
      }catch(NumberFormatException e){
        System.out.println("\tERROR: Must enter a number for " + name + "'s Pay");
      }
    }while(payRate == -1);

    do{
      try{
      System.out.print("\nEnter " + name + "'s hours for the week(Ex: 46.58): ");
    	hours= Double.parseDouble(s.nextLine());
    }catch(NumberFormatException e){
      System.out.println("\tERROR: Must enter a number for " + name + "'s Hours");
    }
  }while(hours == -1);
      plist.add(new Payroll (name, number, hours, payRate));

      name = "";
      nameSize = 0;
      number = -1;
      payRate = -1;
      hours = -1;

    	reply = "n";
      i++;
    } while (reply.equalsIgnoreCase("y"));

    while(k<plist.size()){
      System.out.println(plist.get(k));
      k++;
    }
    s.close();
  }//end main
}//end main
