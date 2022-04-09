public class MiddleAverage {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		System.out.print("Value: ");
		int value = In.nextInt();
		while (value != -1) {
			count++;
			sum += value;
			if (value < min)
				min = value;
			if (value > max)
				max = value;
			System.out.print("Value: ");
			value = In.nextInt();
		}
		if (count >= 2) {
			double average = (double)(sum - min - max) / (double)(count - 2);
			System.out.println("Middle average = " + average);
		}
		
	}
}
