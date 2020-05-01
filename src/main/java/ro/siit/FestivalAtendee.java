package ro.siit;
import java.util.Random;

public class FestivalAtendee extends Thread {

    private TicketType ticketType;
    private FestivalGate festivalGate;

    public FestivalAtendee(FestivalGate festivalGate) {
        this.festivalGate = festivalGate;
    }

    @Override
    public void run() {
        try {
            sleep(new Random().nextInt(50000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.ticketType = TicketType.randomTicket();
        festivalGate.validateTicket(getTicketType());
    }

    public TicketType getTicketType() {
        return ticketType;
    }
}
