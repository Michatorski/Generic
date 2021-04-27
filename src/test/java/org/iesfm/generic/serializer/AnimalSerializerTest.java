package org.iesfm.generic.serializer;

import org.iesfm.generic.Animal;
import org.junit.Assert;
import org.junit.Test;

public class AnimalSerializerTest {

    @Test
    public void animalDeserializerTest(){
        Deserializer<Animal> animalDeserializer = new AnimalSerializer();

        String animal = "color:Red,age:4,species:Dog";

        Animal expected = new Animal("Red", 4, "Dog");
        Animal result = animalDeserializer.deserialize(animal);

        Assert.assertEquals(expected, result);

    }
}
