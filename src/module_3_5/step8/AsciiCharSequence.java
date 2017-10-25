package module_3_5.step8;

import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {

    private final byte value[];

    public AsciiCharSequence(byte[] value) {
        this.value = value;
    }

    @Override
    public int length() {
        return value.length;
    }

    @Override
    public char charAt(int index) {

        return (char) value[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {

        return new AsciiCharSequence(Arrays.copyOfRange(value, start, end));
    }

    @Override
    public String toString() {
       //return Arrays.toString(value);
        return new String(value, StandardCharsets.US_ASCII);//ISO_8859_1);
    }
}
