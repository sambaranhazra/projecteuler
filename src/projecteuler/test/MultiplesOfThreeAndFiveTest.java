package projecteuler.test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import projecteuler.production.MultiplesOfThreeAndFive;

public class MultiplesOfThreeAndFiveTest {

	public MultiplesOfThreeAndFive multiples;

	@Before
	public void setup() {
		multiples = new MultiplesOfThreeAndFive();
	}

	@Test
	public void whenNullIsEntered_thenZeroIsReturned() {
		assertEquals(0, multiples.sumOfMultiples(null));

	}

	@Test
	public void whenZeroIsEntered_thenZeroIsReturned() {
		assertEquals(0, multiples.sumOfMultiples(0));
	}

	@Test
	public void whenThreeIsEntered_thenThreeIsReturned() {
		assertEquals(0, multiples.sumOfMultiples(3));
	}

	@Test
	public void whenFourIsEntered_thenThreeIsReturned() {
		assertEquals(3, multiples.sumOfMultiples(4));
	}

	@Test
	public void whenFiveIsEntered_thenThreeIsReturned() {
		assertEquals(3, multiples.sumOfMultiples(5));
	}

	@Test
	public void whenOneIsEntered_thenZeroIsReturned() {
		assertEquals(0, multiples.sumOfMultiples(1));
	}

	@Test
	public void whenSixIsEntered_thenEightIsReturned() {
		assertEquals(8, multiples.sumOfMultiples(6));
	}

	@Test
	public void whenTenIsEntered_thenTwentyThreeIsReturned() {
		assertEquals(23, multiples.sumOfMultiples(10));
	}

	@Test
	public void whenSixteenIsEntered_thenSixtyIsReturned() {
		assertEquals(60, multiples.sumOfMultiples(16));
	}

	@Test
	public void whenThousandIsEntered_thenXXXXIsReturned() {
		assertEquals(233168, multiples.sumOfMultiples(1000));
	}
}
