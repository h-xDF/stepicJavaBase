package module_3_5.Step9;

public class NegativeTextAnalyzer extends KeywordAnalyzer {

    private String[] negativeWorld = {":(", "=(", ":|"};

    @Override
    String[] getKeywords() {
        return negativeWorld;
    }

    @Override
    Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
