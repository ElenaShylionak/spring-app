package org.example;

public class ClassicalMusic implements Music{

    private ClassicalMusic() { //create a private constructor. So we are limited to creating objects of this class (new)
    }

    public static ClassicalMusic getClassicalMusic() { //create a factory method
        return new ClassicalMusic();

    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
