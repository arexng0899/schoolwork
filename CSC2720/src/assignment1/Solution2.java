package assignment1;

// Test Cases:
// What if there is no second array? What if one of the arrays have 
// different data types? What if one of the arrays have a null
// data type? What if one of the arrays have no length?
// Throw exceptions for these cases such as "No second array found." or "One array has no length."
public class Solution2 {

	public static void main(String[] args) {
		// constructing both initial arrays
		int[] array1 = {1, 5, 6, 6, 9, 9, 9, 11, 11, 21};
		int[] array2 = {6, 6, 9, 11, 21, 21, 21};
		// calling the search method
		int[] result = matchingElements(array1, array2);
		int length = result.length;
		// deduplication
		length = deDuplication(result, length);
			// Printing out the new array
			for(int i = 0; i < length; i++) {
				System.out.print(result[i] + " ");
			}
	}
	
	// binary search method
	public static int[] matchingElements(int[] arr1, int[] arr2) {
		 // initialize indexes for both arrays
		 int indexB = 0, indexA = 0;
		 int i = 0;
		 int newArray[] = new int[7];
		 
		 	// loop if the condition is the same
	        while (indexB < arr2.length && indexA < arr1.length) {
	        	// reinitializes left and right for each iteration
	            int left1 = 0, right1 = (arr1.length)-1;
	            
	            // binary search algorithm
	            while (left1 <= right1) {
	                int mid1 = (left1 + right1)/2;
	                if (arr2[indexB] == arr1[mid1]) {
	                	// Value assignment
	                	newArray[i] = arr1[mid1];
	                	i++;
	                    // break when common element is found
	                    break; 
	                } else if (arr2[indexB] > arr1[mid1])
	                    left1 = mid1 + 1;
	                else right1 = mid1 - 1;
	            }
	            // move to next item
	            indexB++;
	        }
	     return newArray;
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

// Part 3:
// Since both arrays given are already sorted, we can skip the sorting complexities and go straight to finding the common values.
// The suggestion that comes to mind is implementing a linear algorithm to find these common elements.
// We can then go through each array one by one and match the values with the other array.
// If the values match then we add one to a counter and store the value in an empty variable.
// Then we can use these stored values and the counter to print out the output.
