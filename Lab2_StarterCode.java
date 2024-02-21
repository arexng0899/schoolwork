public class TheDotProduct2D {

	public static void main(String[] args) {
		int[][] my2D_1= {{21,32,23,34},{13,14,15,16}};
		System.out.println("Original Vector: ");
		PrintVectD(my2D_1);

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
      
   }
	// your code here for new method DotProd()
	// header: public static void DotProd(int[][] x, int[][] y) 	
	
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