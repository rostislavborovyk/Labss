package lab_5;
import java.util.Arrays;


public class Text {
    private Sentence[] sentences;

    public Text(String textString) {
        String[] splited = textString.split("(?<=[.!?])");
        sentences = new Sentence[splited.length];
        for (int i = 0; i < splited.length; i++) {
            sentences[i] = new Sentence(splited[i]);
            System.out.println(sentences[i]);
        }
    }
//    private String[] allWords(){
//        String[] words;
//        for (int i = 0; i < sentences.length; i++) {
//            String sentence = sentences[i];
//            for (int j = 0; j < sentences[i].length; j++) {
//
//            }
//        }
//    }
    public void getWordsCount(String word){
        int count = 0;
        for (int i = 0; i < sentences.length; i++) {
            String [] wordsInSentence = sentences[i].getWordFromSentence();
            if (Arrays.asList(wordsInSentence).contains(word.toLowerCase())){
                count++;
            }
        }
        System.out.println("Word " + word + " is in " + count +" sentences");

    }

}
