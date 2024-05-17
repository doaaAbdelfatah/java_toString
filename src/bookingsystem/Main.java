package bookingsystem;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Movie e1 = new Movie("Opening Movie1" ,new Date() , "Cenima 1" , 150 );
        e1.setMovieDirector("Mohamed Emam");
        String [] actors ={"Mona Zaki" , "Ahmed Helmy"};
        e1.setMovieActors(actors);
        e1.setMovieDirector("Mohamed Emam");

        SportsEvent e2 = new SportsEvent("basket ball game" ,new Date() , "Club" , 100 );
        e2.setFirstSportsTeam("El Ahly");
        e2.setSecondSportsTeam("El Zamalk");

        Concert e3 = new Concert("jaz" ,new Date() , "obera" , 200 );

        BookingSystem bs = new BookingSystem(100,3);
        bs.addEvent(e1);
        bs.addEvent(e2);
        bs.addEvent(e3);
        bs.removeEvent("basket ball game");

        Customer c = new Customer(1 , "Doaa" , "doaa@gmail.com");
        BookingSystem.BookingManager bm =  bs.new BookingManager();
        Ticket t1 = bm.bookTicket(e1 , c , new Date() ) ;
        Ticket t2 = bm.bookTicket(e2 , c , new Date() ) ;
        Ticket t3 = bm.bookTicket(e2 , c , new Date() ) ;

//        System.out.println(t);
//        bm.cancelBooking(1);



        System.out.println(bs);
    }
}
