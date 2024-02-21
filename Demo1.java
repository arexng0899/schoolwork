
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Enter how many integers will be put in an array:");
		int elements=input.nextInt();
		int[] arr=new int[elements];
		
		for(int k=0;k<elements;k++) {
			System.out.println("Enter integer value "+(k+1)+": ");
			arr[k]=input.nextInt();
			System.out.println();
		}
		System.out.println("Is your array sorted in increasing order?: "+isSorted(arr));
		input.close();
	}
	public static boolean isSorted(int[] array) {
		//if there is only one or zero elements or no array, return true
		if(array.length<=1||array==null) {
			return true;
		}
		for(int i=0; i<array.length-1; i++) {
			if(array[i]>array[i+1]) {
				return false;
			}
		}
		return true;
	}
}
