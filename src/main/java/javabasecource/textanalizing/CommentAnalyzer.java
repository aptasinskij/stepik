package javabasecource.textanalizing;

/**
 * Created by andrew on 14.01.17.
 */
public class CommentAnalyzer {
    public static void main(String[] args) {
        TextAnalyzer[] textAnalyzers = new TextAnalyzer[]{
                new SpamAnalyzer(new String[]{"buy", "order now", "only today"}),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(400)
        };
        String textToAnalyze = "=(Faster! Time to!";
        System.out.println(checkLabels(textAnalyzers, textToAnalyze));
    }

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers){
            Label label = analyzer.processText(text);
            if (label != Label.OK) return label;
        }
        return Label.OK;
    }
}
