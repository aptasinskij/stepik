package javabasecource.acii;

import java.util.Arrays;

/**
 * Created by andrew on 14.01.17.
 */
public class AsciiCharSequence implements CharSequence {

    private byte[] data;

    @Override
    public String toString() {
        return super.toString();
    }


    public AsciiCharSequence(byte[] data){
        this.data = data;
    }

    @Override
    public int length() {
        return this.data.length;
    }

    @Override
    public char charAt(int index) {
        return (char)(data[index] & 0xff);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start == 0 && end == data.length) return this;
        return new AsciiCharSequence(Arrays.copyOfRange(data, start, end));
    }
}
