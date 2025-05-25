package services;

import models.User;

public class UserService {
    public void registerUser(User user) {
        System.out.println("User Registered: " + user.getName());
    }
}