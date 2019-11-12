package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
		for(int a = 0; a < array.length; a++) {
for(int i = 0; i < array.length - 1; i++) {
	if(array[i] <= array[i + 1]) {
		continue;
	}
	else {
		int save = 0;
		int save2 = 0;
		
		Random r = new Random();
		int rand = r.nextInt(array.length);
		Random r2 = new Random();
		int rand2 = r2.nextInt(array.length);
		
		if(array[rand] > array[rand2]) {
			save = array[rand];
			save2 = array[rand2];
			array[rand] = save2;
			array[rand2] = save;
			display.updateDisplay();
		}
	}
	}
}
	}
}
