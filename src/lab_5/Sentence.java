package lab_5;
import java.util.Arrays;

public class Sentence {
    private Word[] words;
    private String sentence;
    private String[] wordsInSentence;

    public Sentence(String sentenceString) {
        this.sentence = sentenceString;
        this.wordsInSentence = sentenceString.split("(?=[ " +
                Punctuation.punctuationSymbols +
                "])| ");
        words = new Word[wordsInSentence.length];
        for (int i = 0; i < wordsInSentence.length; i++) {
            words[i] = new Word(wordsInSentence[i]);
//            System.out.print(words[i]);
        }

    }
    public String toString(){
        return sentence;
    }
    public String[] getWordFromSentence(){
        for (int i = 0; i < wordsInSentence.length; i++) {
            wordsInSentence[i] = wordsInSentence[i].replaceAll("\\s", "");
        }
        return wordsInSentence;
    }

}
