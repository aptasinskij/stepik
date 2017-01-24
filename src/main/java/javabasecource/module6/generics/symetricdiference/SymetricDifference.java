package javabasecource.module6.generics.symetricdiference;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by andrew on 24.01.17.
 */
public class SymetricDifference<T>{
    public Set<T> getSetDifference(Set<? extends T> first, Set<? extends T> second){
        Set<T> newSet = new HashSet<T>();
        for (T element : first){
            if (!second.contains(element)){
                newSet.add(element);
            }
        }
        for (T element : second){
            if (!first.contains(element)) {
                newSet.add(element);
            }
        }
        return newSet;
    }
}
