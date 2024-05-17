package bookingsystem;

import java.util.Date;

public class SportsEvent extends Event {
    private String firstSportsTeam ;
    private String secondSportsTeam ;

    public String getFirstSportsTeam() {
        return firstSportsTeam;
    }

    public void setFirstSportsTeam(String firstSportsTeam) {
        this.firstSportsTeam = firstSportsTeam;
    }

    public String getSecondSportsTeam() {
        return secondSportsTeam;
    }

    public void setSecondSportsTeam(String secondSportsTeam) {
        this.secondSportsTeam = secondSportsTeam;
    }

    public SportsEvent(String eventName, Date eventDate, String venue, double ticketPrice) {
        super(eventName, eventDate, venue, ticketPrice);
    }

    @Override
    public String toString() {
        return super.toString() + "SportsEvent{" +
                "firstSportsTeam='" + firstSportsTeam + '\'' +
                ", secondSportsTeam='" + secondSportsTeam + '\'' +
                '}';
    }
}
