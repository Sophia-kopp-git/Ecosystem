package org.example;

public enum Gender {
    FEMALE("female"),
    MALE("male");

    private String value;

    Gender(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
