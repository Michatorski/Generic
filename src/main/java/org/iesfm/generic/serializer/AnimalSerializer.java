package org.iesfm.generic.serializer;

import org.iesfm.generic.Animal;

import java.util.HashMap;
import java.util.Map;

public class AnimalSerializer implements Serializer<Animal>, Deserializer<Animal> {

    final static  String COLOR_FIELD = "color";
    final static  String AGE_FIELD = "animal";
    final static  String SPECIES_FIELD = "species";

    @Override
    public String serialize(Animal animal) {
        String colorField = COLOR_FIELD+ ":" + animal.getColor();
        String ageField = AGE_FIELD+":" + animal.getAge();
        String speciesField = SPECIES_FIELD+":" + animal.getSpecies();

        return colorField +","+ageField+","+speciesField;
    }

    @Override
    public Animal deserialize(String value) {
        //Static value = "color:Red,age:10,species:Dog"
        Map<String, String> animalFields = new HashMap<>();
        for (String field: value.split(",")) {
            // field = "color:Red" || "age:10" || "specie:Dog"
            String [] fieldValues = field.split(":");

                                //color:       //Red
            animalFields.put(fieldValues[0], fieldValues[1]);
        }

        String color = animalFields.get(COLOR_FIELD);
        int age = Integer.parseInt(animalFields.get(AGE_FIELD));
        String specie = animalFields.get(SPECIES_FIELD);

        return new Animal(color, age, specie);
    }
}
