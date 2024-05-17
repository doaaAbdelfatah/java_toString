package bookingsystem;

import java.util.Date;

public class Ticket {
    private  static  int counter =0;
    private int ticketId;
    private Event event;

    private Date bookingDate;

    private Customer customer;

    public Ticket( Event event, Date bookingDate) {

        this.ticketId = ++counter;
        this.event = event;
        this.bookingDate = bookingDate;
    }

    public Ticket( Event event, Date bookingDate, Customer customer) {
        this.ticketId =  ++counter;;
        this.event = event;
        this.bookingDate = bookingDate;
        this.customer = customer;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", event=" + event +
                ", bookingDate=" + bookingDate +
                ", customer=" + customer +
                '}';
    }
}
