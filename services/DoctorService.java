package services;

import models.Disease;

public class DoctorService {
    public void recommendDoctor(Disease disease) {
        if (disease.getName().equals("Flu")) {
            System.out.println("Recommended Doctor: Dr. Smith (General Physician)");
        } else if (disease.getName().equals("Heart Disease")) {
            System.out.println("Recommended Doctor: Dr. Brown (Cardiologist)");
        } else {
            System.out.println("Consult a General Physician.");
        }
    }
}
