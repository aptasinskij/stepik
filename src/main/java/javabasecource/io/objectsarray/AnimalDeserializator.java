package javabasecource.io.objectsarray;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

/**
 * Created by andrew on 23.01.17.
 */
public class AnimalDeserializator {
    public Animal[] deserializeAnimalArray(byte[] data) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data))){
            Animal[] animals = new Animal[objectInputStream.readInt()];
            for (int i = 0; i < animals.length; i++){
                animals[i] = (Animal) objectInputStream.readObject();
            }
            return animals;
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
