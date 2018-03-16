package com.higgsup.collection;

import java.util.*;

public class School {
    private List<String> studentName = new ArrayList<>();
    private Set<String> studentCountry = new HashSet<>();
    private Map<String, List<String>> studentMap = new HashMap<>();


    public List<String> getStudentName() {
        return studentName;
    }

    public void setStudentName(List<String> studentName) {
        this.studentName = studentName;
    }

    public Set<String> getStudentCountry() {
        return studentCountry;
    }

    public void setStudentCountry(Set<String> studentCountry) {
        this.studentCountry = studentCountry;
    }

    public Map<String, List<String>> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<String, List<String>> studentMap) {
        this.studentMap = studentMap;
    }

    @Override
    public String toString() {
        return "School{" +
                "studentName=" + studentName +
                ", studentCountry=" + studentCountry +
                ", studentMap=" + studentMap +
                '}';
    }
}
