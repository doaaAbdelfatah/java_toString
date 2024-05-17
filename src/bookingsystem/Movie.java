package bookingsystem;

import java.util.Arrays;
import java.util.Date;

public class Movie extends Event {

    private String movieDirector;
    private String [] movieActors;

    public Movie(String eventName, Date eventDate, String venue, double ticketPrice) {
        super(eventName, eventDate, venue, ticketPrice);
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public String[] getMovieActors() {
        return movieActors;
    }

    public void setMovieActors(String[] movieActors) {
        this.movieActors = movieActors;
    }

    @Override
    public String toString() {
        return super.toString() +"Movie{" +
                "movieDirector='" + movieDirector + '\'' +
                ", movieActors=" + Arrays.toString(movieActors) +
                '}';
    }
}
