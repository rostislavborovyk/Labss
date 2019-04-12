package lab_5;

public class Sentence {

    private String sentence;
    public Word[] words;

    Sentence(String sentenceString) {
        this.sentence = sentenceString;

        String[] wordsInSentence = sentenceString.split("(?=[ !?,.:;])| ");
        words = new Word[wordsInSentence.length];
        for (int i = 0; i < wordsInSentence.length; i++) {
            words[i] = new Word(wordsInSentence[i]);
        }


    }
    void printSentence (){
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]);
        }
        System.out.print("\n");
    }

    boolean isWordInSentence(String word){
        boolean flag = false;
        for (int i = 0; i < words.length; i++) {
            if (words[i].compareWithWord(word) == 0) {
                flag = true;
            }

        }
        return flag;
    }

}
