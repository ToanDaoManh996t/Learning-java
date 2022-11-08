package org.o7planning.tutorial.javabasic.inheritance.animal;

public class Cat extends Animal {
    public int age;
    public int height;

    public Cat(int age, int height) {
        super();
        this.age = age;
        this.height = height;
    }

    public Cat(String name, int age, int height) {
        super(name);
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String getAnimalName() {
        return "Cat";
    }
}
