package javabasecource.io.checksum;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Cn+1=rotateLeft(Cn) xor bn+1, где Cn — контрольная сумма первых n байт данных,
 * rotateLeft — циклический сдвиг бит числа на один бит влево (чтобы не изобретать велосипед,
 * используйте Integer.rotateLeft),
 * bn — n-ный байт данных.
 **/
public class ControlSumChecker {

    public int checkSumOfStream(InputStream inputStream) throws IOException{
        int checkSum = 0;
        int b = inputStream.read();
        while (b != -1){
            checkSum = Integer.rotateLeft(checkSum, 1) ^ b;
            b = inputStream.read();
        }
        return checkSum;
    }

}
