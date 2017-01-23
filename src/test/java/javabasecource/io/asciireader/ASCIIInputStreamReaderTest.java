package javabasecource.io.asciireader;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

import static org.junit.Assert.*;

/**
 * Created by andrew on 23.01.17.
 */
public class ASCIIInputStreamReaderTest {

    private byte[][] testData;
    private String[] resultData;

    @Before
    public void setUp(){
        testData = new byte[][]{{48, 49, 50, 51}, {100, 101, 102, 103}, {122, 121, 120}, {111, 112, 113}, {80, 81, 82}};
        resultData = new String[]{"0123", "defg", "zyx", "opq", "PQR"};
    }

    @Test
    public void testOn0123() throws IOException{
        ASCIIInputStreamReader reader = new ASCIIInputStreamReader();
        for (int i = 0; i < testData.length; i++){
            String result = reader.readAsString(new ByteArrayInputStream(testData[i]), Charset.forName("ASCII"));
            assertEquals("Wrong result string.", resultData[i], result);
        }
    }

}