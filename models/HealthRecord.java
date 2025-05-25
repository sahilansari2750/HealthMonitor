package models;

public class HealthRecord {
    private User user;
    private String symptoms;
    
    public HealthRecord(User user, String symptoms) {
        this.user = user;
        this.symptoms = symptoms;
    }
    
    public User getUser() { return user; }
    public String getSymptoms() { return symptoms; }
}