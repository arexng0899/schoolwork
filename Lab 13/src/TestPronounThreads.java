   public class TestPronounThreads 
   {
   	public static void main(String[] args) 
      {
   		String[] pronouns = {"mine","ours","yours","hers","his","theirs"};
   		String filename = "src/War_n_Peace.txt";
   		//Create the correct pathing in 'filename' where you put the 
   		//'War_n_Peace.txt' file
		
   		Thread Xthread = null;
         
      		try 
            {
			      //You need to create a loop to iterate through the 'pronouns'
			      //String array. For each one of the pronouns, you need to 
			      //instantiate a new 'Xthread' with the 'PossessivePronoun' class and 
			      //filename. Give the threadname something that uses a number used in
			      //iterating over the String array.
			      //Print the 'Xthread.getName()' to show what thread is created for each
			      //pronoun in the String array. (See output in instructions)
		         
               for(int i = 0; i < (pronouns.length); i++)
               {
                  Xthread = new Thread(new PossessivePronouns(pronouns[i], filename), ("ThreadID-" + i));
                  Xthread.start();
                  System.out.println(Xthread.getName() + " for pronoun: " + pronouns[i]);
               }
		      } 
            
            catch(Exception e) 
            {
			      e.printStackTrace();
		      }
	   }

   }