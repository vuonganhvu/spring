package com.higgsup.model;

public class Student {
    private String name;
    private String location;

    public Student() {
    }

    public Student(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "name=" + name + " location=" + location;
    }
}
