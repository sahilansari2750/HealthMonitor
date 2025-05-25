package main;

import models.User;
import models.HealthRecord;
import models.Disease;
import services.UserService;
import services.PredictionService;
import services.DoctorService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect user details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your BMI: ");
        double bmi = scanner.nextDouble();
        scanner.nextLine();  // Consume the newline

        System.out.print("Enter your medical history (or 'None'): ");
        String medicalHistory = scanner.nextLine();

        // Create User object
        User user = new User(name, age, bmi, medicalHistory);
        UserService userService = new UserService();
        userService.registerUser(user);

        // Collect symptoms
        System.out.print("Enter your symptoms (comma-separated): ");
        String symptoms = scanner.nextLine();

        // Create HealthRecord object
        HealthRecord record = new HealthRecord(user, symptoms);
        PredictionService predictionService = new PredictionService();
        predictionService.analyzeHealth(record);

        // Get disease prediction
        Disease predictedDisease = new Disease("Flu", "Medium"); // Example, modify if needed
        DoctorService doctorService = new DoctorService();
        doctorService.recommendDoctor(predictedDisease);

        scanner.close();
    }
}
