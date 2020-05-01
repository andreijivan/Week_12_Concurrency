package ro.siit;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<FestivalAtendee> festivalAttendees = new ArrayList<>();
        FestivalGate festivalGate = new FestivalGate();
        FestivalStatistics festivalStatistics = new FestivalStatistics(festivalGate);

        festivalStatistics.setDaemon(true);
        festivalStatistics.start();

        for (int i = 0; i < 100; i++) {
            FestivalAtendee festivalAtendee = new FestivalAtendee(festivalGate);
            festivalAttendees.add(festivalAtendee);
            festivalAtendee.start();
        }

        for (FestivalAtendee festivalAtendee : festivalAttendees) {
            try {
                festivalAtendee.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(festivalGate.getStatistics());
    }
}



