package models;

public class PredictionModel {
    public Disease predictDisease(HealthRecord record) {
        String symptoms = record.getSymptoms().toLowerCase();
        if (symptoms.contains("fever") && symptoms.contains("cough")) {
            return new Disease("Flu", "Medium");
        } else if (symptoms.contains("chest pain") && symptoms.contains("shortness of breath")) {
            return new Disease("Heart Disease", "High");
        } else {
            return new Disease("Unknown", "Low");
        }
    }
}