package lab_5;

public class Punctuation {
    static final String punctuationSymbols = "!?,.:;";
    public boolean isPunctuation(String symbols){
        return punctuationSymbols.contains(symbols);
    }
}
