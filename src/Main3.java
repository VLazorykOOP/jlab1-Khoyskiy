import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        String text = "Hello abcd абект abycde";

        String small = text.toLowerCase();
        String[] words = small.split(" ");
        //System.out.println(words[1]);
        System.out.println("Слова в лексикографичному порядку:");
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            //System.out.println(chars);
            String sortedWord = new String(chars);
             //System.out.println(chars);
            if (word.equals(sortedWord)) {
                System.out.println(word);
            }
        }
    }
}