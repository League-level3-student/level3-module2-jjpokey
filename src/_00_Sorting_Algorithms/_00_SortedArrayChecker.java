package _00_Sorting_Algorithms;



public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
public static boolean intArraySorted(int[] unsorted) {
	
	for(int i = 0; i < unsorted.length; i++) {
		//check end of array
		if(i + 1 >= unsorted.length) {
			return true;
		}
		//check order
		if(unsorted[i] <= unsorted[i + 1] ) {
			continue;
		}
		else {
			return false;
		}
	}
	return true;
}

	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise

	public static boolean doubleArraySorted(double[] unsorted) {
		
		for(int a = 0; a < unsorted.length; a++) {
			//check end of array
			if(a + 1 >= unsorted.length) {
				return true;
			}
			//check order
			if(unsorted[a] <= unsorted[a + 1] ) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}

	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
public static boolean charArraySorted(char[] unsorted) {
	
	for(int b = 0; b < unsorted.length; b++) {
		if(b + 1 >= unsorted.length) {
			return true;
		}
		if(unsorted[b] <= unsorted[b + 1]) {
			continue;
		}
		else {
			return false;
		}
	}
	
	return false;
}
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
public static boolean stringArraySorted(String[] unsorted) {
	for(int c = 0; c < unsorted.length; c++) {
		
	if(c + 1 >= unsorted.length) {
		return true;
	}
	if(unsorted[c].charAt(0) <= unsorted[c + 1].charAt(0)) {
		
	}
	else {
		return false;
	}
	}
	return true;
}



}
