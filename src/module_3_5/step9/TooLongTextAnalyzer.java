package module_3_5.step9;

public class TooLongTextAnalyzer implements TextAnalyzer {

    private int size;

    public TooLongTextAnalyzer(int size) {
        this.size = size;
    }

    @Override
    public Label processText(String text) {

        if(text.length() <= size) {
            return Label.OK;
        } else {
            return Label.TOO_LONG;
        }
    }
}
