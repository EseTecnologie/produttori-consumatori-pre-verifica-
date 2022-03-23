import java.util.ArrayList;

public class Client extends Thread{
    private final int ID;
    private SharedTable s;
    ArrayList<Food> ateFood;

    public Client(int id, SharedTable s) {
        this.ID = id;
        this.s = s;
        this.ateFood = new ArrayList<>();
    }

    @Override
    public void run() {
        Food toEatFood;
        System.out.println(ID + " running");
        do{
            toEatFood = s.getFoodFromTable();
            if(toEatFood == null) continue;
            try {
                sleep(toEatFood.getEatingTime()*10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ateFood.add(toEatFood);
        }while (!s.isTableEmpty());

        System.out.println(ID + " ended");
    }
}
