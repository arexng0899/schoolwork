// Alex Ng CSC 1301 Lab 10

// class 
public class GroceryItemOrder
{  // initialization
   String name;
   int quantity;
   double pricePerUnit;
      // grocery item order method
      public GroceryItemOrder(String name, int quantity, double pricePerUnit)
      {  // setting
         this.name = name;
         this.quantity = quantity;
         this.pricePerUnit = pricePerUnit;
      }
      // setter for quantity
      public void setQuantity(int quantity)
      {
         this.quantity = quantity;
      }
      // cost for item method
      public double getCost()
      {
         return (this.quantity * this.pricePerUnit);
      }
      // getter methods for other attributes
      public String getName()
      {
         return this.name;
      }
      
      public int getQuantity()
      {
         return this.quantity;
      }
      
      public double getPricePerUnit()
      {
         return this.pricePerUnit;
      }
}