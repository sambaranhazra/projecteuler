package projecteuler.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import projecteuler.production.SumOfEvenFibonacci;

public class SumOfEvenFibonacciTest {

	public SumOfEvenFibonacci sum;

	@Before
	public void setup() {
		sum = new SumOfEvenFibonacci();
	}

	@Test
	public void whenNullIsEntered_thenZeroIsReturned() {
		assertEquals(0, sum.sumOfEvenFibonacci(this, null));
	}

	@Test
	public void whenZeroIsEntered_thenZeroIsReturned() {
		assertEquals(0, sum.sumOfEvenFibonacci(this, 0));
	}

	@Test
	public void whenTwoIsEntered_thenTwoIsReturned() {
		assertEquals(2, sum.sumOfEvenFibonacci(this, 2));
	}

	@Test
	public void whenThreeIsEntered_thenTwoIsReturned() {
		assertEquals(2, sum.sumOfEvenFibonacci(this, 3));
	}

	@Test
	public void whenTenIsEntered_thenTenIsReturned() {
		assertEquals(10, sum.sumOfEvenFibonacci(this, 10));
	}

	@Test
	public void whenThirtyFourIsEntered_thenFortyfourIsReturned() {
		assertEquals(44, sum.sumOfEvenFibonacci(this, 34));
	}

	@Test
	public void whenFourMillionIsEntered_thenXXXXIsReturned() {
		assertEquals(4613732, sum.sumOfEvenFibonacci(this, 4000000));
	}

	

}
