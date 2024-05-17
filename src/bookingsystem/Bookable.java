package bookingsystem;

import java.util.Date;

public interface Bookable {

   Ticket bookTicket(Event event , Customer customer , Date bookDate);
}
