// Alex Ng CSC 1301 Lab 10

public class GroceryDriver
{
   public static void main(String[] args)
   {
      GroceryList list1 = new GroceryList();
      GroceryItemOrder carrot = new GroceryItemOrder("Carrot", 5, 0.40);
      list1.add(carrot);
      GroceryItemOrder lasagna = new GroceryItemOrder("Lasagna", 10, 2.00);
      list1.add(lasagna);
      System.out.print(list1);
   }
}