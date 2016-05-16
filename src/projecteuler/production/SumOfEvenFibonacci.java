package projecteuler.production;

import java.util.ArrayList;

import projecteuler.test.SumOfEvenFibonacciTest;

public class SumOfEvenFibonacci {
	ArrayList<Integer> numbers = new ArrayList();

	public int sumOfEvenFibonacci(
			SumOfEvenFibonacciTest sumOfEvenFibonacciTest, Integer number) {
		if (number == null)
			return 0;
		int sum = 0;
		populateSumArray(number);
		for (Integer i : numbers)
			sum += i;
		return sum;
	}

	public void populateSumArray(Integer number) {
		int a = 0, b = 1;
		for (int i = 1; i <= number; i++) {
			int current = a + b;
			int temp = b;
			b = current;
			a = temp;
			if (current > number)
				break;
			if (current % 2 == 0)
				numbers.add(current);
		}
	}

}
