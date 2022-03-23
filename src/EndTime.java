public class EndTime extends Thread{
    SharedTable s = new SharedTable();
    @Override
    public void run() {
        try {
            sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n\nDay ended\n\n");
        s.timeEnd = true;
        System.out.println(s.timeEnd);
        return;
    }
}
