package com.springcourse.springdemo.mvc;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;

    @Min(value = 0, message = "must be greater than or equal to zero")
    @Max(value = 10, message = "must be less than or equal to 10")
    private int freePasses;

    public Customer() {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public int getFreePasses() {
        return freePasses;
    }

}
