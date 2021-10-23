package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {
    private int idNumber;
    private String name;
    private String surname;
    private char sex;
    private LocalDate dateOfBirth;
    private int NrOfPublishedPosts;

    public ForumUser(final int idNumber,final String name,final String surname,final char sex,final int year, final int month, final int day,final int nrOfPublishedPosts) {
        this.idNumber = idNumber;
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(year,month,day);
        this.NrOfPublishedPosts = nrOfPublishedPosts;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNrOfPublishedPosts() {
        return NrOfPublishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idNumber=" + idNumber +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", NrOfPublishedPosts=" + NrOfPublishedPosts +
                '}';
    }
}
