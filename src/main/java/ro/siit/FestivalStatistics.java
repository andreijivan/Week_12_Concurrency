package ro.siit;

public class FestivalStatistics extends Thread {

    private FestivalGate festivalGate;

    public FestivalStatistics(FestivalGate festivalGate) {
        this.festivalGate = festivalGate;
    }

    @Override
    public void run() {
       while (true){
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(festivalGate.getStatistics());
       }
    }
}
