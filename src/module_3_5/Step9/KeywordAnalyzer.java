package module_3_5.step9;

abstract public class KeywordAnalyzer implements TextAnalyzer {

    abstract String[] getKeywords();

    abstract Label getLabel();

    public Label processText(String text) {

        for (String word: getKeywords()) {

            if (text.contains(word)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
