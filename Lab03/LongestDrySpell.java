public class LongestDrySpell {
	public static void main(String[] args) {
		System.out.print("Rainfall: ");
		double rain = In.nextDouble();

		int count = 0;
		int max = 0;

		while(rain != -1){

			if(rain == 0) {				
				count++;
				if(max < count) max = count;
			}
			else {
				//if(max < count) max = count;
				count = 0;
			}
			System.out.print("Rainfall: ");
			rain = In.nextDouble();
		}
		//if(max < count) max = count;
		System.out.println("Longest dry spell = "+max);
	}
}
