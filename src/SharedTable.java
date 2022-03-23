import java.util.ArrayList;

public class SharedTable {
    private ArrayList<Food> foodOnTable;
    private Object lockTable = new Object();
    static Boolean timeEnd;

    public SharedTable() {
        this.foodOnTable = new ArrayList<>();
        timeEnd = false;
    }

    synchronized public void addFoodToTable(Food foodToAdd){
        //TODO capire perché rimpiazza i cibi già prodotti
        foodOnTable.add(foodToAdd);
    }
    synchronized public Food getFoodFromTable(){
        if(foodOnTable.size() <= 0){
            return null;
        }
        Food toReturn = foodOnTable.get(foodOnTable.size() - 1);
        foodOnTable.remove(toReturn);
        return toReturn;
    }
    public boolean isTableEmpty(){
        if(foodOnTable.size() == 0) return true;
        return false;
    }

    public ArrayList<Food> getFoodOnTable(){
        return foodOnTable;
    }
}
