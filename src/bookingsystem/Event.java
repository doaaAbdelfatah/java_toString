package bookingsystem;

import java.util.Date;

public class Event {
    private String eventName;
    private Date eventDate;
    private String venue;
    private  double ticketPrice;

    public Event(String eventName, Date eventDate, String venue, double ticketPrice) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.venue = venue;
        this.ticketPrice = ticketPrice;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventName='" + eventName + '\'' +
                ", eventDate=" + eventDate +
                ", venue='" + venue + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
