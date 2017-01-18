package javabasecource.io.checksum;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by andrew on 18.01.17.
 */
public class ControlSumCheckerTest {

    @Test
    public void checkSumOfStreamTest() throws IOException{
        int conrolSum = new ControlSumChecker().checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01}));
        Assert.assertEquals("Wrong check sum value", 71, conrolSum);
    }

}