package org.o7planning.tutorial.javaenum;

public class GenderDemo {
    public static void main(String[] args) {
        Gender marryGender = Gender.FEMALE;

        System.out.println("Code: " + marryGender.getCode());
        System.out.println("Text: " + marryGender.getText());

        for(Gender gender: Gender.values()) {
            System.out.println(gender.getText());
        }

        String code = "M";
        Gender gender = Gender.getGenderByCode(code);
        System.out.println("Gender by code: " + gender);
    }
}
