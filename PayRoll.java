// Alex Ng Homework 5 CSC 1301 Monday - Wednesday 3:30 - 4:45 Program 1

public class PayRoll
{
   public static void main(String[] args)
   {
      // Variable Initializing
      String name = "Bob Cyclone";
      int hours = 16;
      double rate = 32.04;
      double taxRate = 0.078;
      // Calculations and rounding for gross pay, tax deducted, and net pay
      double pay = hours * rate; 
      double taxTotal = pay * taxRate;
      double net = pay - taxTotal;
      double taxRounded = Math.round(taxTotal * 100.0) / 100.0;
      double netRounded = Math.round(net * 100.0) / 100.0;
      
      // Print out statements for the inputs
      System.out.println("Employee name: " + name);
      System.out.println("Hours worked: " + hours);
      System.out.println("Hourly rate: $" + rate);
      System.out.println("Gross pay: $" + pay);
      System.out.println("Tax deducted: $" + taxRounded);
      System.out.println("Net pay: $" + netRounded);
   }
}
      
   
   
   