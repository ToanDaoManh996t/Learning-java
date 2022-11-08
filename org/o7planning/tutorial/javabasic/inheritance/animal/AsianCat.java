package org.o7planning.tutorial.javabasic.inheritance.animal;

public class AsianCat extends Cat {
    public AsianCat(String name, int age, int height) {
        super(name, age, height);
    }

    @Override
    public String getAnimalName() {
        return "Asian Cat";
    }
}
