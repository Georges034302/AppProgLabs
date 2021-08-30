public class ZWordCount {
    public static void main(String[] args) {
        String[] sentences = {
            "green ideas Zleep furiously",
            "a zebra graZed",
            "zorro WAZ zore",
            "I feel snoozy"
        };
        
        for (String sentence:sentences) {   //for(int i=0; i< sentences.length; i++)
            System.out.println(sentence);   //System.out.println(sentences[i])
        }
        System.out.println("Words containing a 'z' = " + zWords(sentences));
    }

    public static int zWords(String[] sentences) {
        int sum = 0;
        for(String sentence:sentences){
            sum += zWords(sentence.toLowerCase());
        }
        return sum;
    }

    public static int zWords(String sentence) {
        int count = 0;
         //+ means one or many characters of the previous
         // \ or escape nullifies the powers of following character 
        for(String word:sentence.split(" +"))     
            if(containsZ(word))
                count++;                  
        return count;
    }

    public static boolean containsZ(String word) {
        return word.contains("z");
    }
}


