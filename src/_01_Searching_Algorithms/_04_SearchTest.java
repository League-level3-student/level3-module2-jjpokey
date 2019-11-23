package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		String[] testData = {"a", "b", "c", "d"};
		assertEquals(1,_00_LinearSearch.linearSearch(testData, "b"));
		//1. use the assertEquals method to test your linear search method.
		
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] testData = {0, 1, 2, 3, 4, 5, 6};
		assertEquals(3, _01_BinarySearch.binarySearch(testData, 0, 6, 3));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] testData = {1,2,3,4,5};
		assertEquals(3,_02_InterpolationSearch.interpolationSearch(testData, 4));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] testData = {1, 2, 3, 4, 5, 6};
		assertEquals(2, _03_ExponentialSearch.exponentialSearch(testData, 3));
	}
}
