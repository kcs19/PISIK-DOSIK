package model.domain;

public class DiseaseFoodDTO {
	private String foodType;
	private String foodName;
	private String reason;
	
	public DiseaseFoodDTO(String foodType, String foodName, String reason) {
		this.foodType = foodType;
		this.foodName = foodName;
		this.reason = reason;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
}
