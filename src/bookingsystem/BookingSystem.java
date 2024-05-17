package bookingsystem;

import java.util.Date;

public class BookingSystem {

    private  Ticket [] tickets ;
    private  Event [] events;

    boolean addEvent(Event e){
        for (int i = 0; i < events.length; i++) {
            if (events[i] == null){
                events[i] = e;
                return  true;
            }
        }
        return  false;
    }
    boolean removeEvent(String eventName){
        for (int i = 0; i < events.length; i++) {
            if(events[i] != null && events[i].getEventName().equals(eventName)){
                events[i] = null;
                return  true;
            }
        }
        return false;
    }

    public BookingSystem(int ticketsCount  , int eventsCount) {
        tickets = new Ticket[ticketsCount];
        events = new Event[eventsCount];
    }

    public  class EventListing{

        void listEvents(){
            for (Event e : events){
                System.out.println(e);
            }
        }

        void avaliableTickets(){
            for (Ticket t : tickets){
                System.out.println(t);
            }
        }
    }
    public  class BookingManager implements  Bookable , Cancellable{
        @Override
        public Ticket bookTicket(Event event, Customer customer, Date bookDate) {
            Ticket t = new Ticket( event , bookDate , customer);
            for (int i = 0; i < tickets.length ; i++) {
                if(tickets[i] == null ){
                    tickets[i] = t ;
                    return  t;
                }
            }
            return null;
        }

        @Override
        public boolean cancelBooking(int ticketId) {
            for (int i = 0; i < tickets.length; i++) {
                if(tickets[i] != null && tickets[i].getTicketId() == ticketId){
                    tickets[i] = null;
                    return true;
                }
            }
            return false;
        }
    }
}
