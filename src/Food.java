public class Food {
    private int foodID; //if 0 null
    private String foodName;
    private int productionTime;//expressed in milliseconds
    private int eatingTime;//expressed in milliseconds

    public Food() {
        this.foodID = 0;
        this.foodName = "";
        this.productionTime = 0;
        this.eatingTime = 0;
    }

    public int getFoodID() {
        return foodID;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getProductionTime() {
        return productionTime;
    }

    public int getEatingTime() {
        return eatingTime;
    }

    public Boolean generateFoodById(int foodID){
        if(foodID < 0 || foodID > 3) return false;
        this.foodID = foodID;
        switch (this.foodID) {
            case 1:
                this.foodName = "Pizza";
                this.productionTime = 600;
                this.eatingTime = 1700;
                break;
            case 2:
                this.foodName = "Hamburger";
                this.productionTime = 800;
                this.eatingTime = 2300;
                break;
            case 3:
                this.foodName = "Patatine";
                this.productionTime = 400;
                this.eatingTime = 1000;
                break;
        }
        return true;
    }
}
