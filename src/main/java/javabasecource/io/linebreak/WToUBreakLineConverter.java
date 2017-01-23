package javabasecource.io.linebreak;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by andrew on 18.01.17.
 */

//         byte[] bytes =         {65, 66, 13, 13, 10, 10, 13, 67, 13, 13};
//            byte[] expectedBytes = { 65, 66, 13,     10, 10, 13, 67, 13, 13 };
//            byte[] bytes =         { 65, 13, 10, 10, 13 };
//            byte[] expectedBytes = { 65,     10, 10, 13 };
//            byte[] bytes =         { 1, 2, 13, 10, 3, 4, 13, 10, 5, 6 };
//            byte[] expectedBytes = { 1, 2,     10, 3, 4,     10, 5, 6 };
//            byte[] bytes =         { 1, 2, 3, 13, 10, 13, 10, 4, 5, 6 };
//            byte[] expectedBytes = { 1, 2, 3,     10,     10, 4, 5, 6 };
//            byte[] bytes =         { 1, 2, 3 };
//            byte[] expectedBytes = { 1, 2, 3 };
//            byte[] bytes =         { 13, 10, 1, 2, 3, 4, 5, 6 };
//            byte[] expectedBytes = {     10, 1, 2, 3, 4, 5, 6 };
//            byte[] bytes =         { 1, 2, 3, 13, 10, 4, 5, 6 };
//            byte[] expectedBytes = { 1, 2, 3,     10, 4, 5, 6 };
//            byte[] bytes =         { 1, 2, 3, 4, 5, 6, 13, 10 };
//            byte[] expectedBytes = { 1, 2, 3, 4, 5, 6,     10 };
//            byte[] bytes =         { 1, 2, 3, 13, 13, 10, 4, 5, 6 };
//            byte[] expectedBytes = { 1, 2, 3, 13,     10, 4, 5, 6 };
//            byte[] bytes =         { 1, 2, 3, 10, 13, 4, 5, 6 };
//            byte[] expectedBytes = { 1, 2, 3, 10, 13, 4, 5, 6 };


public class WToUBreakLineConverter {
    public static void main(String[] args) throws IOException{
        int tmp1, tmp2;
        tmp1 = System.in.read();
        while (tmp1 != -1) {
            tmp2 = System.in.read();
            if (tmp1 != 13 || tmp2 != 10)
                System.out.write(tmp1);
            tmp1 = tmp2;
        }
        System.out.flush();
    }
}
