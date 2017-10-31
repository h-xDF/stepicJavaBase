package module_3_5.Step9;

public class TooLongAnalyzer {

    private int size;

    public TooLongAnalyzer(int size) {
        this.size = size;
    }

    public Label processText(String text) {

        if (text.length() >= size) {
            return Label.TOO_LONG;
        } else {
            return Label.OK;
        }
    }


}
