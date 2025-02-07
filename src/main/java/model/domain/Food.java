package model.domain;

public class Food {
    private int foodId;
    private String foodName;

    public Food(int foodId, String foodName) {
        this.foodId = foodId;
        this.foodName = foodName;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
