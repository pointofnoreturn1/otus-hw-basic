package io.vaku;

public class User {
    private String lastName;
    private String firstName;
    private String patronymic;
    private int birthYear;
    private String email;

    public User(String lastName, String firstName, String patronymic, int birthYear, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "ФИО: " + lastName + " " + firstName + " " + patronymic +
                "\nГод рождения: " + birthYear +
                "\ne-mail: " + email;
    }
}
