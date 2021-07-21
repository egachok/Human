package com.dmitrydunai;

public class Human {
    private final String lastName;
    private final String firstName;
    private String patronymic;

    public Human(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public Human(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFullName() {
        return  lastName + " " + firstName + " " + (patronymic == null? "" : patronymic);
    }

    public String getShortName() {
        return lastName + " " + firstName.charAt(0) + "." +  (patronymic == null? "" : patronymic.charAt(0) + ".");
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
