package lab_5;

public class Word {
    private Letter[] letters;
    private String word;

    public Word(String word){
        this.word = word;
        char[] chars = word.toCharArray();
        letters = new Letter[chars.length];
        for (int i = 0; i < chars.length; i++) {
            letters[i] = new Letter(chars[i]);
        }

    }
    public String toString(){
        return word;
    }
}
