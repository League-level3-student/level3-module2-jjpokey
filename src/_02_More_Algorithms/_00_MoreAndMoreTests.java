package _02_More_Algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class _00_MoreAndMoreTests {

	@Test
	  public void MultTest() {

	    assertEquals("10 x 0 = 0", MoreTestsCode.multiply(10, 0));
	    assertEquals("10 x 10 = 100", MoreTestsCode.multiply(10, 10));
	    assertEquals("8 x 11 = 88", MoreTestsCode.multiply(8, 11));
	  }

	@Test
	  public void PrimeTest() {
//work on this 
		//unfinished
	    assertTrue(MoreTestsCode.isPrime(3));
	    assertTrue(MoreTestsCode.isPrime(5));
	    assertTrue(MoreTestsCode.isPrime(541));
	    assertFalse(MoreTestsCode.isPrime(4));
	    assertFalse(MoreTestsCode.isPrime(12));
	    assertTrue(MoreTestsCode.isPrime(527));

	  }

	@Test
	  public void SquareTest() {

	    assertTrue(MoreTestsCode.isSquare(4));
	    assertTrue(MoreTestsCode.isSquare(144));
	    assertTrue(MoreTestsCode.isSquare(64));
	    assertFalse(MoreTestsCode.isSquare(10201));
	    assertFalse(MoreTestsCode.isSquare(1));
	    assertFalse(MoreTestsCode.isSquare(3));
	    assertFalse(MoreTestsCode.isSquare(22));
	    assertFalse(MoreTestsCode.isSquare(143));

	  }

	@Test
	  public void CubeTest() {

	    assertTrue(MoreTestsCode.isCube(27));
	    assertTrue(MoreTestsCode.isCube(216));
	    assertTrue(MoreTestsCode.isCube(729));
	    assertFalse(MoreTestsCode.isCube(1));
	    assertTrue(MoreTestsCode.isCube(3));
	    assertFalse(MoreTestsCode.isCube(22));
	    assertFalse(MoreTestsCode.isCube(143));

	  }



}
