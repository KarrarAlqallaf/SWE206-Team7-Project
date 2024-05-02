import java.util.HashSet;
import java.util.List;
public class Reservation {
    private Individual reserver;
    private int rN;
    private Space space;
    private Duration duration;
    private HashSet<Duration> durations;
    private List<Individual> members;
    private Restriction restriction;
    private String reason;

    public Individual getReserver() {
        return reserver;
    }

    public void setReserver(Individual individual) {
        this.reserver = individual;
    }

    public int getRN() {
        return rN;
    }

    public void setRN(int rN) {
        this.rN = rN;
    }

    public Space getSpace() {
        return space;
    }

    public void setSpace(Space space) {
        this.space = space;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public HashSet<Duration> getDurations() {
        return durations;
    }

    public void setDurations(HashSet<Duration> durations) {
        this.durations = durations;
    }

    public List<Individual> getMembers() {
        return members;
    }

    public void setMembers(List<Individual> members) {
        this.members = members;
    }

    public Restriction getRestriction() {
        return restriction;
    }

    public void setRestriction(Restriction restriction) {
        this.restriction = restriction;
    }

    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
}