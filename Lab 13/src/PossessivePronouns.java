import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

   public class PossessivePronouns implements Runnable
   {
   	private String pnoun, file;
      
   	   public PossessivePronouns(String Xpnoun, String Xfile) 
         {
   	   	this.pnoun = Xpnoun;
   	   	this.file = Xfile;
   	   }

	      @Override
	      public void run() 
         {
	   	   try 
            {
			      Path path = Paths.get(this.file);
			      readFile(path);
		      }
            
		      catch (Exception e1) 
            {
			      e1.printStackTrace();
		      }
	      }
         
	      private void readFile(Path Xpath) 
         {
		      int counter = 0;
            
		         try 
               {
			         String line;
			         BufferedReader bufferedReader = Files.newBufferedReader(Xpath);
                     
                     while((line = bufferedReader.readLine()) != null)
                     {
                        String[] words = line.split("\\s+");
                        
                           for(String word: words)
                           {
                              if(word.contains(this.pnoun))
                              {
                                 counter++;
                              }
                           }
                     }
                     
                     System.out.println("Found " + counter + " occurrences for " + this.pnoun + "\n");
                     bufferedReader.close();
		         }
		         catch (IOException ioe) 
               {
		         	ioe.printStackTrace();
		         }
	      }
   }