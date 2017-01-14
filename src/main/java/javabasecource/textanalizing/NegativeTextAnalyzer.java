package javabasecource.textanalizing;

/**
 * Created by andrew on 14.01.17.
 */
public class NegativeTextAnalyzer extends KeywordAnalyzer{

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    protected String[] getKeywords() {
        return new String[]{":(", "=(", ":|"};
    }

}
