package module_3_5.step8;

import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class AsciiCharSequence implements CharSequence {

    private final byte value[];

    public AsciiCharSequence(byte[] value) {
        this.value = value;
    }

    //String

    @Override
    public int length() {
        return value.length;
    }

    @Override
    public char charAt(int index) {
        return Character.highSurrogate(value[index]);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.subSequence(start, end - 1);
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        for(byte element: value) {
            buf.append();
        }
        return buf;
    }


    /*public CharSequence subSequence(int beginIndex, int endIndex) {
        return this.substring(beginIndex, endIndex);
    }*/
}
