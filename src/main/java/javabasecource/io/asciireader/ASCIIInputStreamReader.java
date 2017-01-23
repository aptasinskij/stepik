package javabasecource.io.asciireader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/**
 * Created by andrew on 23.01.17.
 */
public class ASCIIInputStreamReader {
    public String readAsString(InputStream inputStream, Charset charset) throws IOException{
        String result = "";
        Reader reader = new InputStreamReader(inputStream, charset);
        int readData;
        while ((readData = reader.read()) != -1){
            result = result + (char) readData;
        }
        return result;
    }
}
