package assignment1;

public class Solution1 {

	public static void main(String[] args) {
		// constructing both initial arrays
		int[] array1 = {1, 5, 6, 6, 9, 9, 9, 11, 11, 21};
		int[] array2 = {6, 6, 9, 11, 21, 21, 21};
		// temp values for storing data
		int temp;
		int tempInt = 0;
		int length = 0;
		
			// nested loop to find length
			for(int i = 0; i < array1.length; i++) {
				for(int j = 0; j < array2.length; j++) {
					// check to see if both array elements match
					if(array1[i] == array2[j]) {
						length = length + 1;
					}
				}
			}
			
			// creating new array with the length found as the constraint
			int result[] = new int[length];
			length = result.length;
			
				// nested loop for inserting shared values in result array
				for(int i = 0; i < array1.length; i++) {
					for(int j = 0; j < array2.length; j++) {
						// check to see if both array elements match
						if(array1[i] == array2[j]) {
							// transfer operation
							temp = array1[i];
							result[tempInt] = array1[i];
							tempInt = tempInt + 1;
						}
					}
				}
			
				// calling deduplication method
				length = deDuplication(result, length);
			
				// printing out result array
				for(int i = 0; i < length; i++) {
					System.out.print(result[i] + " ");
				}
	}
	
	// deduplication method
	public static int deDuplication(int[] input, int n) {
		if(n == 0 || n == 1) {
			return n;
		}
			// array for storing unique items
			int[] temp = new int[n];
			int j = 0;
				
				for(int i = 0; i < n - 1; i++) {
					if(input[i] != input[i + 1]) {
						temp[j++] = input[i];
					}
				}
				
					temp[j++] = input[n - 1];
						
						// loop to change the original array
						for(int i = 0; i < j; i++) {
							input[i] = temp[i];
						}
						
							return j;
	}

}
