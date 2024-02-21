// CSC 1302 Alex Ng Lab 6 Online Section

   public class DataEntryException extends Exception
   {
         public DataEntryException(String str, int num)
         {
            super("DataEntryException: Invalid " + str + "\t Value: " + num);
         }
   }