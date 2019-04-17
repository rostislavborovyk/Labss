package lab_5;

public class Word {
    private Letter[] letters;
    private String word;

    Word(String word){
        this.word = word;
        char[] chars = word.toCharArray();
        letters = new Letter[chars.length];
        for (int i = 0; i < chars.length; i++) {
            letters[i] = new Letter(chars[i]);
        }


    }
    @Override
    public String toString(){
        return word;
    }

    Word delSpaceInTheStart(){
        char[] newWord;
        char[] charsOfWord = word.toCharArray();
        if (charsOfWord[0] == ' '){
            newWord = new char[charsOfWord.length-1];
            for (int i = 0; i < newWord.length; i++) {
                newWord[i] = charsOfWord[i+1];
            }
            String str = new String(newWord);
            Word res = new Word(str);

            return res;
        }
        return new Word(word);
    }

    int compareWithWord(String wordFromList){

        int res = wordFromList.compareTo(word.replaceAll("\\s", ""));
        return res;
    }
}
