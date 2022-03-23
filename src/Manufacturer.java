import java.util.LinkedList;
import java.util.Random;

public class Manufacturer extends Thread{
    private final int ID;
    private final SharedTable s;
    LinkedList<Food> productMade;
    private Random rnd = new Random();

    public Manufacturer(int id, SharedTable s) {
        ID = id;
        this.s = s;
        this.productMade = new LinkedList<>();
    }

    @Override
    public void run() {
        Food product = new Food();
        System.out.println("m "+ ID + " running");
        do{
            product.generateFoodById(rnd.nextInt(3)+1);
            productMade.add(product);
            s.addFoodToTable(product);
            try {
                sleep(product.getProductionTime()*10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while (!s.timeEnd);

        System.out.println("m "+ID + " ended");
    }
}
