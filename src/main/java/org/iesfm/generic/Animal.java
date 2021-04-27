package org.iesfm.generic;

import org.iesfm.generic.serializer.Serializer;

import java.util.Objects;

public class Animal{
    private String color;
    private int age;
    private String species;

    public Animal(String color, int age, String species) {
        this.color = color;
        this.age = age;
        this.species = species;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(color, animal.color) && Objects.equals(species, animal.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, age, species);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                '}';
    }
}
