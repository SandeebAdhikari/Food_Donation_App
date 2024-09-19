package Donor;

import User.User;

public class Donor extends User {
    public String foodName;
    public String foodType;
    public int foodQuantity;
    public String unit;
    private User user;


    public Donor(User user) {
        super(user);
        this.user = user;
    }

    public Donor(String foodName, String foodType, int foodQuantity, String unit, User user) {
        this.foodName = foodName;
        this.foodType = foodType;
        this.foodQuantity = foodQuantity;
        this.unit = unit;
        this.user = user;
    }

    //public User getUser() {return user;}
    public String getFoodName() {return foodName;}
    public String getFoodType() {return foodType;}
    public int getFoodQuantity() {return foodQuantity;}
    public String getUnit() {return unit;}

    public void setFoodName(String foodName) {this.foodName = foodName;}
    public void setFoodType(String foodType) {this.foodType = foodType;}
    public void setFoodQuantity(int foodQuantity) {this.foodQuantity = foodQuantity;}
    public void setUnit(String unit) {this.unit = unit;}

}
