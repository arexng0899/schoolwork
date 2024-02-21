// CSC 1302 Alex Ng Lab 4 Online Section

public class BankAccount 
{ 
   private String name; 
   private Double balance;
    
   public void deposit(double amount) 
   { 
      balance = balance + amount; 
   } 
   
   public void withdraw(double amount) 
   {     
      balance = balance - amount; 
   } 
   
   public void setName(String new_name)
   {
      name = new_name;
   }
   
   public void setBalance(double amount)
   {
      balance = amount;
   }
     
   public BankAccount(){}     
   public BankAccount(String name_new, double bal_new) 
   { 
      name = name_new;
      balance = bal_new;
   } 
       
   public String toString() 
   {
      return (name + ", $" + balance); 
   } 
 
}