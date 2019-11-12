package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		for(int a = 0; a < array.length; a++) {
			for(int b = 0; b < array.length - 1; b++) {
				if(array[b] > array[b + 1]) {
					int save = array[b];
					int save2 = array[b + 1];
					array[b] = save2;
					array[b + 1] = save;
					display.updateDisplay();
				}
				
					
				
			}
		}
	}
	
}
