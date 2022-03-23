public class Main {

    public static void main(String[] args) {
        SharedTable s = new SharedTable();
        paintThread paint = new paintThread(s);
        paint.start();

        Manufacturer m1 = new Manufacturer(1, s);
        Manufacturer m2 = new Manufacturer(2, s);
        m1.start();
        m2.start();

        EndTime e = new EndTime();
        e.start();
        try {
            e.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        try {
            m1.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        try {
            m2.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        Client[] clients = new Client[5];
        for (int i = 0; i < clients.length; i++) {
            clients[i] = new Client(i, s);
            clients[i].start();
        }

        for (int i = 0; i< clients.length; i++){
            try {
                clients[i].join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        System.out.println("Produttore 1");
        System.out.println(m1.productMade.size()+" cibi prodotti: ");
        for(int i = 0; i<m1.productMade.size();i++){
            System.out.println(" -"+ m1.productMade.get(i).getFoodName());
        }

        System.out.println("Produttore 2");
        System.out.println(m2.productMade.size()+" cibi prodotti: ");
        for(int i = 0; i<m2.productMade.size();i++){
            System.out.println(" -"+ m2.productMade.get(i).getFoodName());
        }

        for (int i = 0; i< clients.length;i++){
            System.out.println("Consumatore "+i);
            System.out.println(clients[i].ateFood.size()+" cibi consumati: ");
            for(int j = 0; j<clients[i].ateFood.size();j++){
                System.out.println(" -"+ clients[i].ateFood.get(j).getFoodName());
            }
        }
    }
}
