// models/User.java
package models;

public class User {
    private String name;
    private int age;
    private double bmi;
    private String medicalHistory;
    
    public User(String name, int age, double bmi, String medicalHistory) {
        this.name = name;
        this.age = age;
        this.bmi = bmi;
        this.medicalHistory = medicalHistory;
    }
    
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getBmi() { return bmi; }
    public String getMedicalHistory() { return medicalHistory; }
}

