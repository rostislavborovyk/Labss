package lab_5;

public class Sentence {

    private String sentence;
    private String[] wordsInSentence;

    Sentence(String sentenceString) {
        this.sentence = sentenceString;
        this.wordsInSentence = sentenceString.split("(?=[ " +
                Punctuation.punctuationSymbols +
                "])| ");
        Word[] words = new Word[wordsInSentence.length];
        for (int i = 0; i < wordsInSentence.length; i++) {
            words[i] = new Word(wordsInSentence[i]);
        }

    }
    public String toString(){
        return sentence;
    }
    String[] getWordFromSentence(){
        for (int i = 0; i < wordsInSentence.length; i++) {
            wordsInSentence[i] = wordsInSentence[i].replaceAll("\\s", "");
        }
        return wordsInSentence;
    }

}
