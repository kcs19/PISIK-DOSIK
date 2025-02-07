package model.domain;

public class DiseaseFoods {
    private int id;
    private int diseaseId;
    private int foodId;
    private String foodType; // "Recommended" 또는 "Avoided"
    private String reason;

    public DiseaseFoods(int id, int diseaseId, int foodId, String foodType, String reason) {
        this.id = id;
        this.diseaseId = diseaseId;
        this.foodId = foodId;
        this.foodType = foodType;
        this.reason = reason;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(int diseaseId) {
        this.diseaseId = diseaseId;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}

