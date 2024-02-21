// CSC 1302 Alex Ng Lab 2 Online Section

public class TheDotProduct2D {

	public static void main(String[] args) {
		int[][] my2D_1= {{1,3},{4,6},{15,16}};
		System.out.println("Original Vector: ");
		PrintVect2D(my2D_1);

		int rows= my2D_1.length;
		int cols= my2D_1[0].length;
		int[][] my2D_2 = new int[cols][rows];
		my2D_2=Transpose2D(my2D_1);
			
		System.out.println("\nTransposed Vector: ");
		PrintVect2D(my2D_2);
		System.out.println("\nDot Product of two Vectors: ");
		DotProd(my2D_1,my2D_2);
	}
	public static int[][] Transpose2D(int[][] x_arr) {
		int cols=x_arr[0].length;
		int rows=x_arr.length;
		int trans_arr[][] = new int[cols][rows];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				trans_arr[j][i]=x_arr[i][j];
			}
		}
		return (trans_arr);
	}
   
   public static void DotProd(int[][] x, int[][] y)
   {
      // initializing variables specifically the row and column numbers for both x and y
      int rows1 = x.length;
      int cols1 = x[0].length;
      int rows2 = y.length;
      int cols2 = y[0].length;
      // new vector with its bounds being the first row number and the second column number
      int z[][] = new int[rows1][cols2];
         // looping for each row
         for(int i = 0; i < rows1; i++)
         {
            // looping for each column
            for(int j = 0; j < cols2; j++)
            {
               for(int k = 0; k < rows2; k++)
                  // operation for calculating each index of the new vector
                  z[i][j] += x[i][k] * y[k][j];
            }
         }
      // calling back the print method
      PrintVect2D(z);
   }
	
	public static void PrintVect2D(int[][] vect) {
		System.out.print("{ ");
		for(int i=0; i<vect.length; i++) {
			if(i>0)
				System.out.print("  ");
			for(int j=0; j<vect[0].length; j++) {
				if(j<vect[0].length-1)
					System.out.print(vect[i][j]+", ");
				else
					System.out.print(vect[i][j]);
			}
			if(i<vect.length-1)
				System.out.println("");
			else
				System.out.println(" }");
		}
	}
}