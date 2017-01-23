package javabasecource.io.objectsarray;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by andrew on 23.01.17.
 */
public class Animal implements Serializable{
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }
}
