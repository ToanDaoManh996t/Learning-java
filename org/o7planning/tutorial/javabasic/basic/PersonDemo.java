package org.o7planning.tutorial.javabasic.basic;

public class PersonDemo {
    public static void main(String[] args) {
        Person edison = new Person("Thomas Edison", 1847);
        System.out.println("Info:");
        System.out.println("Name: " + edison.getName());
        System.out.println("Born year: " + edison.getBornYear());
        System.out.println("Place of birth: " + edison.getPlaceOfBirth());

        Person billGates = new Person("Bill Gates", 1955, "Seattle, Washington");
        System.out.println("Info:");
        System.out.println("Name: " + billGates.getName());
        System.out.println("Born year: " + billGates.getBornYear());
        System.out.println("Place of birth: " + billGates.getPlaceOfBirth());
    }
}
