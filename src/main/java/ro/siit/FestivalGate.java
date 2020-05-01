package ro.siit;
import java.util.Vector;

public class FestivalGate extends Thread {
    Vector<TicketType> festivalAtendeeList;

    public FestivalGate() {
        this.festivalAtendeeList = new Vector<>();
    }

    public void validateTicket(TicketType ticketType) {
        festivalAtendeeList.add(ticketType);
    }

    public String getStatistics() {
        int peopleEntered = 0, FULL = 0, fullVIP = 0, freePASS = 0, oneDAY = 0, oneDayVIP = 0;
        for (TicketType festivalAtendee : festivalAtendeeList) {
            peopleEntered++;
            switch (festivalAtendee.toString()) {
                case "FULL":
                    FULL++;
                    break;
                case "fullVIP":
                    fullVIP++;
                    break;
                case "freePASS":
                    freePASS++;
                    break;
                case "oneDAY":
                    oneDAY++;
                    break;
                case "oneDayVIP":
                    oneDayVIP++;
                    break;
            }
        }

        return peopleEntered + " ATTENDEES ENTERED" +
                "\n" + FULL + " have FULL tickets " +
                "\n" + fullVIP + " have fullVIP tickets " +
                "\n" + freePASS + " have freePASS tickets " +
                "\n" + oneDAY + " have oneDAY tickets " +
                "\n" + oneDayVIP + " have oneDayVIP tickets ";
    }
}
