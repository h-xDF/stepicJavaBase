package module_3_5.step9.stepicFormat;

public class Solution {

    interface TextAnalyzer {
        Label processText(String text);
    }

    enum Label {

        SPAM,
        NEGATIVE_TEXT,
        TOO_LONG,
        OK
    }

    abstract class KeywordAnalyzer implements TextAnalyzer {

        abstract protected String[] getKeywords();

        abstract protected Label getLabel();

        public Label processText(String text) {

            for (String word: getKeywords()) {

                if (text.contains(word)) {
                    return getLabel();
                }
            }
            return Label.OK;
        }
    }

    class NegativeTextAnalyzer extends KeywordAnalyzer {

        private String[] negativeWorld = {":(", "=(", ":|"};

        @Override
        protected String[] getKeywords() {
            return negativeWorld;
        }

        @Override
        protected Label getLabel() {
            return Label.NEGATIVE_TEXT;
        }
    }

    public class SpamAnalyzer extends KeywordAnalyzer {

        private String[] keywords;

        public SpamAnalyzer(String[] keywords) {
            this.keywords = keywords;
        }

        @Override
        protected String[] getKeywords() {
            return keywords;
        }

        @Override
        protected Label getLabel() {
            return Label.SPAM;
        }
    }

    public class TooLongTextAnalyzer implements TextAnalyzer {

        private int maxLength = 0;

        public TooLongTextAnalyzer(int size) {
            this.maxLength = size;
        }

        @Override
        public Label processText(String text) {

            if(text.length() <= maxLength) {
                return Label.OK;
            } else {
                return Label.TOO_LONG;
            }
        }
    }

    public Label checkLabels(TextAnalyzer[] analyzer, String text) {

        Label status = Label.OK;

        for (TextAnalyzer analyses: analyzer) {

            status = analyses.processText(text);

            if (status != Label.OK) {
                return status;
            }
        }

        return Label.OK;
    }





}
