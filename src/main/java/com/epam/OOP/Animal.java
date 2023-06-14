package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        return  "This animal is mostly %s. It has %d paw%s and %s fur."
                .formatted(color, numberOfPaws,
                        numberOfPaws==1 ? "" : "s",
                        hasFur ? "a" : "no");
    }
}
