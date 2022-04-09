public class CountVowels {
	public static void main(String[] args) {
		int count = 0;
		System.out.print("Character: ");
		char c = In.nextChar();
		while (c != '.') {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
			System.out.print("Character: ");
			c = In.nextChar();
		}
		System.out.println("Vowel count = " + count);
	}
}
