package com.giea.model.people;

public abstract class Employee extends Person {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
