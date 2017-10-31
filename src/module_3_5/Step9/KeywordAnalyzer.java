package module_3_5.Step9;

abstract public class KeywordAnalyzer {

    abstract String[] getKeywords();

    abstract Label getLabel();

    public Label processText(String text) {

        for (String word: getKeywords()) {

            if (text.indexOf(word) != -1) {
                return Label.OK;
            }
        }

        return getLabel();
    }
}
