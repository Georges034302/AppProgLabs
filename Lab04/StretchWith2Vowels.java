public class StretchWith2Vowels {
    public static void main(String[] args) {
        String sentence;
        while (!(sentence = readSentence()).equals("*")) {
            System.out.println("Matching words = " + matchCount(sentence));
        }
        System.out.println("Done");
    }

    public static String readSentence() {
        System.out.print("Sentence: ");
        return In.nextLine();
    }

    public static int matchCount(String sentence) {
        int count = 0;
        for (String word : sentence.toLowerCase().split(" +")) {
            if (matches(word)) {
                count++;
            }
        }
        return count;
    }

    public static boolean matches(String word) {
        for (String segment : word.split("z")) {
            if (vowelCount(segment) == 2)
                return true;
        }
        return false;
    }

    public static int vowelCount(String segment) {
        int count = 0;
        for (int i = 0; i < segment.length(); i++) {
            if (isVowel(segment.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char c) {
        return "aeiou".contains("" + c);
    }
}
