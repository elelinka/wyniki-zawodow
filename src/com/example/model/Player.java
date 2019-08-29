package com.example.model;

public class Player implements Comparable<Player> {
    private String firstName;
    private String lastName;
    private int result;

    public Player(String firstName, String lastName, int result) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.result = result;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", result=" + result +
                '}';
    }

    @Override
    public int compareTo(Player o) {
        if (this.result > o.result) {
            return 1;
        } else if (this.result == o.result) {
            if (this.lastName.compareToIgnoreCase(o.lastName) > 0) {
                return 1;
            }
            if (this.firstName.compareToIgnoreCase(o.firstName) > 0) {
                return 1;
            }
        }
        return -1;
    }
}