import java.util.Arrays;

public class lab_3 {
    public static void main(String[] args) {
        // C3  = 1  (StringBuffer)
        // C17 = 9  Задано текст та масив слів. Підрахувати у скількох реченнях зустрічається кожне слово масиву.
        StringBuffer str_buffer = new StringBuffer("Слово слово точка. Буква слово - слово точка. Точка.");
        String[] words = {"Слово","Буква","Точка","Кома"};
        System.out.println("String: " + str_buffer);
        System.out.println("Array of words: " + Arrays.toString(words));
        String str = str_buffer.toString();
        String[] sentences = str.split("\\.");
        for (int i = 0; i < words.length; i++) {
            byte k = 0;
            for (int j = 0; j < sentences.length; j++) {
                String[] words_in_sentences = sentences[j].split(" ");
                for (int l = 0; l < words_in_sentences.length; l++) {             // translating each word of
                    words_in_sentences[l] = words_in_sentences[l].toLowerCase();  // sentence to lower case
                }
                if (Arrays.asList(words_in_sentences).contains(words[i].toLowerCase())) {
                    k += 1;
                }
            }
            if (k != 0){
                System.out.println("Word " + words[i] + " is in " + k + " sentences");
            }else{
                System.out.println("Word " + words[i] + " not in any sentence!");

            }
        }
    }
}

