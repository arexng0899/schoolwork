// Alex Ng CSC 1301 Lab 10

import java.util.ArrayList;

   public class GroceryList
   {
      ArrayList<GroceryItemOrder> list = null;
      int n;
      
         public GroceryList()
         {
            list = new ArrayList<GroceryItemOrder>();
            this.n = 0;
         }
      
         public void add(GroceryItemOrder item)
         {
            list.add(item);
            System.out.println("*New Grocery* Item Name: " + item.getName() + "     PRICE PER UNIT: " + item.getPricePerUnit() + "      QUANTITY: " + item.getQuantity() + "     TOTAL: $" + (item.getQuantity() * item.getPricePerUnit()));
         }
         
         public double getTotalCost()
         {
            double totalCost = 0;
               
               for(int i = 0; i > list.size(); i++)
               {
                  totalCost += list.get(i).getCost();
               }
            return totalCost;
         }
         
         public String toString()
         {
            return "Total cost: " + getTotalCost();
         }
   }