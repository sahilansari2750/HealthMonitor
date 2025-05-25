package models;

public class Disease {
    private String name;
    private String riskLevel;
    
    public Disease(String name, String riskLevel) {
        this.name = name;
        this.riskLevel = riskLevel;
    }
    
    public String getName() { return name; }
    public String getRiskLevel() { return riskLevel; }
}
