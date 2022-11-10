package org.o7planning.tutorial.javaenum;

public enum Gender {
    MALE("M","Male"),FEMALE("F","Female");
    private String code;
    private String text;

    private Gender(String code, String text) {
        this.code = code;
        this.text = text;
    }

    public static Gender getGenderByCode(String code) {
        for (Gender gender: Gender.values()) {
            if (gender.code.equals(code)) {
                return gender;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText() {
        this.text = text;
    }
}
