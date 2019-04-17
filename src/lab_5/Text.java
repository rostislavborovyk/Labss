package lab_5;
import java.util.Arrays;


class Text {
    private Sentence[] sentences;

    Text(String textString) {
        String[] splited = textString.split("(?<=[.!?])");
        this.sentences = new Sentence[splited.length];
        for (int i = 0; i < splited.length; i++) {
            sentences[i] = new Sentence(splited[i]);
            sentences[i].printSentence();
        }
    }

    int inHowManySentences(String word){
        short counter = 0;
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].isWordInSentence(word)){
                counter++;
            }
        }
        return counter;

    }


}
