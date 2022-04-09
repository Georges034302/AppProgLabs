/**
 * This program reads numbers between 0-999 until -1 is entered
 * and prints out each number in Australian English words.
 */
public class NumberToWords {
	public static void main(String[] args) {
        System.out.print("Number: ");
        int num = In.nextInt();
        while (num != -1) {
            shownum(num);
            System.out.print("Number: ");
            num = In.nextInt();
        }
        System.out.println("Done");  
    }

    private static void shownum(int num) {
        String[] numNames = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
        String[] tensNames = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
        // break down digits xyz
        int hundreds = num / 100; // just x
        int rest = num % 100;     // just yz
        int tens = rest / 10;        // just y
        int ones = rest % 10;        // just z
        String word="";
        
        if (hundreds > 0)
			word+=numNames[hundreds] + " hundred ";
		if (hundreds > 0 && rest > 0)
			word+="and ";
		if (tens >= 2)
			word+=tensNames[tens] + " "+numNames[ones];
		else if (num == 0)
			word="zero ";
		else
			word+=numNames[rest];
		System.out.println(word.trim());   
    }    
}
