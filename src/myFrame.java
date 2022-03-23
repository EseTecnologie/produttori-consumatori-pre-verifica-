import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class myFrame extends JFrame {
    SharedTable s;
    public myFrame(SharedTable s) throws HeadlessException{
        this.setSize(500,300);
        this.s = s;
    }

    @Override
    public void paint(Graphics g) {
        //evitare flickering figure
        Image image = createImage(this.getWidth(), this.getHeight());
        Graphics gImage=image.getGraphics();
        gImage.clearRect(0, 0, this.getWidth(), this.getHeight());

        int startX = 100;
        int x = startX;
        final int size = 50;
        ArrayList<Food> foodsOnTable = s.getFoodOnTable();

        int[] xCoordinates = new int[5];
        for (int i = 0; i < xCoordinates.length;i++){
            xCoordinates[i] = x;
            x += size + 10;
        }

        x = startX;
        for (int i = 0; i<foodsOnTable.size();i++){
            if(foodsOnTable.get(i).getFoodName() == "Pizza"){
                gImage.setColor(Color.red);
                gImage.fillRect(x,100, size, size);
            }else if(foodsOnTable.get(i).getFoodName() == "Hamburger"){
                gImage.setColor(Color.green);
                gImage.fillRect(x,100, size, size);
            }else if(foodsOnTable.get(i).getFoodName() == "Patatine"){
                gImage.setColor(Color.yellow);
                gImage.fillRect(x,100, size, size);
            }
            gImage.setColor(Color.BLACK);
            gImage.drawRect(x,100, size, size);
            x += size + 10;
        }


        g.drawImage(image, 0, 0, this);
    }
}
