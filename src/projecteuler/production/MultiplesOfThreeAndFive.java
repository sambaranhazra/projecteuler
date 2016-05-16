package projecteuler.production;

public class MultiplesOfThreeAndFive {

	public int sumOfMultiples(Integer num) {
		int sum = 0;
		if (num == null)
			return 0;
		for (int temp = 1; temp < num; temp++) {
			if (temp % 3 == 0 || temp % 5 == 0)
				sum += temp;
	
		}
		return sum;
	}

}
