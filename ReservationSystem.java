import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ReservationSystem {
    ArrayList<Reservation> reservationList = new ArrayList<Reservation>();
    ArrayList<Space> spaceList = new ArrayList<Space>();
    ArrayList<Individual> individuals = new ArrayList<Individual>();
    public static void main(String[] args) {
       System.out.println("test");

    }
    public void addSpace(Space space) {
        // Implementation for adding a space
    }

    public void removeSpace(Space space) {
        // Implementation for removing a space
    }

    public void changeSpaceId(String spaceID) {
        // Implementation for changing the ID of a space
    }

    public void changeSpaceName(String name) {
        // Implementation for changing the name of a space
    }

    public void changeSpaceType(SpaceType spaceType) {
        // Implementation for changing the type of a space
    }

    public void changeSpaceRestriction(Restriction restriction) {
        // Implementation for changing the restriction of a space
    }

    public void changeSpaceCapacity(int capacity) {
        // Implementation for changing the capacity of a space
    }

    public void addIndividual(String name, String id, Gender gender, String password) {
        // Implementation for adding an individual
    }

    public void removeIndividual(String name, String id, Gender gender, String password) {
        // Implementation for removing an individual
    }

    public void addReservation(Reservation reservation, Individual individual) {
        // Implementation for adding a reservation
    }

    public void removeReservation(Reservation reservation) {
        // Implementation for removing a reservation
    }

    public void addToReservation(Reservation reservation, Individual individual) {
        // Implementation for adding an individual to a reservation
    }

    public void removeFromReservation(Reservation reservation, Individual individual) {
        // Implementation for removing an individual from a reservation
    }

    public void viewReservationList() {
        // Implementation for viewing the reservation list
    }

    public void changeReservationCapacity(int capacity) {
        // Implementation for changing the capacity of a reservation
    }

    public void changeReserver(Individual individual) {
        // Implementation for changing the reserver of a reservation
    }

    public void changeReservationSpace(Reservation reservation, Space space) {
        // Implementation for changing the space of a reservation
    }

    public void changeReservationDuration(Reservation reservation, Duration duration) {
        // Implementation for changing the duration of a reservation
    }

    public void addEvent(ReservationEvent event, Individual individual) {
        // Implementation for adding an event
    }

    public void removeEvent(ReservationEvent event) {
        // Implementation for removing an event
    }

    public void addToEvent(ReservationEvent event, Individual individual) {
        // Implementation for adding an individual to an event
    }

    public void changeEventGoal(int membersGoal) {
        // Implementation for changing the goal of an event
    }

    public void changeEventDurations(HashSet<Duration> durations) {
        // Implementation for changing the durations of an event
    }

    public void changeERegistrationPeriod(HashSet<Duration> durations) {
        // Implementation for changing the registration period of an event
    }



}
