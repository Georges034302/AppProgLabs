public class AverageValue {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		System.out.print("Value: ");
		int value = In.nextInt();
		while (value != -1) {
			sum += value;
			count++;
			System.out.print("Value: ");
			value = In.nextInt();
		}
		if (count >= 1) {
			double average = (double)sum / (double)count;
			System.out.println("Average = " + average);
		}	
	}
}
