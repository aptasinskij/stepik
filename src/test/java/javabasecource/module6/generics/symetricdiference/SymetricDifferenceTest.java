package javabasecource.module6.generics.symetricdiference;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by andrew on 24.01.17.
 */
public class SymetricDifferenceTest {

    @Test
    public void getSetDifferenceTest(){
        SymetricDifference<Integer> symetricDifference = new SymetricDifference<>();
        Set<Integer> integerSet = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> integerSet2 = new HashSet<>(Arrays.asList(0, 2, 5, 4));
        Set<Integer> resultSet = new HashSet<>(Arrays.asList(0, 1, 5, 3));
        Set<Integer> difference = symetricDifference.getSetDifference(integerSet, integerSet2);
        Assert.assertEquals("Symmetric difference defined wrong", resultSet, difference);
    }

}