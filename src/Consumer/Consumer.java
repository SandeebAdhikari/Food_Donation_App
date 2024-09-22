package Consumer;


import User.User;

public class Consumer extends User {
    public double annualIncome;
    public int noOfFamilyMember;
    public int foodQuantityCounter;
    private User user;

    public Consumer(User user) {
        super(user);
        this.user= user;
    }

    public Consumer(int annualIncome, int noOfFamilyMember, int foodQuantityCounter, User user ) {
        this.annualIncome = annualIncome;
        this.noOfFamilyMember = noOfFamilyMember;
        this.foodQuantityCounter = foodQuantityCounter;
    }

    public User getUser() {return user;}
    public void setUser(User user) {this.user = user;}
    public double getAnnualIncome() {return annualIncome;}
    public int getNoOfFamilyMember() {return noOfFamilyMember;}
    public int getFoodQuantityCounter() {return foodQuantityCounter;}
    public void setFoodQuantityCounter(int foodQuantityCounter) {this.foodQuantityCounter = foodQuantityCounter;}
    public void setAnnualIncome(double annualIncome) {this.annualIncome = annualIncome;}
    public void setNoOfFamilyMember(int noOfFamilyMember) {this.noOfFamilyMember = noOfFamilyMember;}

}
