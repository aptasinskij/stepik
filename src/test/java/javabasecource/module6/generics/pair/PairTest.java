package javabasecource.module6.generics.pair;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrew on 23.01.17.
 */
public class PairTest {
    @Test
    public void taskTest(){
        Pair<Integer, String> pair = Pair.of(1, "hello");
        assertEquals("Wrong value of return element", new Integer(1), pair.getFirst());
        assertEquals("Wrong value of return element", "hello", pair.getSecond());

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        assertEquals(pair, pair2);
        assertEquals("Hashcode is not the same!", pair.hashCode(), pair2.hashCode());
    }
}