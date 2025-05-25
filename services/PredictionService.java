package services;

import models.HealthRecord;
import models.Disease;
import models.PredictionModel;

public class PredictionService {
    private PredictionModel model = new PredictionModel();
    
    public void analyzeHealth(HealthRecord record) {
        Disease disease = model.predictDisease(record);
        System.out.println("Predicted Disease: " + disease.getName() + " | Risk Level: " + disease.getRiskLevel());
    }
}