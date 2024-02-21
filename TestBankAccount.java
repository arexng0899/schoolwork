// CSC 1302 Alex Ng Lab 4 Online Section

public class TestBankAccount
{
   public static void main(String[] args)
   {
      BankAccount B1 = new BankAccount("Bill", 200.00);
      
      System.out.println(B1);
      B1.deposit(500.00);
      System.out.println(B1);
      B1.withdraw(300.00);
      System.out.println(B1);
      
      BankAccount B2 = new BankAccount();
      
      System.out.println(B2);
      B2.setName("Jerry");
      B2.setBalance(350.00);
      System.out.println(B2);
   }
}