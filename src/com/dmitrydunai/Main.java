package com.dmitrydunai;

public class Main {

    public static void main(String[] args) {
        Human human1 = new Human("Alekseev", "Dmitry", "Petrivich");
        System.out.println(human1.getFullName());
        System.out.println(human1.getShortName());

        Human human2 = new Human("Danilchenko", "Egor");
        System.out.println(human2.getFullName());
        System.out.println(human2.getShortName());
    }
}
