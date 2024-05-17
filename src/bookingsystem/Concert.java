package bookingsystem;

import java.util.Date;

public class Concert extends  Event {

    private String performers;

    public Concert(String eventName, Date eventDate, String venue, double ticketPrice) {
        super(eventName, eventDate, venue, ticketPrice);
    }

    public String getPerformers() {
        return performers;
    }

    public void setPerformers(String performers) {
        this.performers = performers;
    }

    @Override
    public String toString() {
        return super.toString() +  "Concert{" +
                "performers='" + performers + '\'' +
                '}';
    }
}
