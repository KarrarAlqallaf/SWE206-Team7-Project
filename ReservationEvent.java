import java.util.HashSet;

public class ReservationEvent {
    private int membersGoal;
    private Duration eDuration;
    private HashSet<Duration> eDurations;

    public int getMembersGoal() {
        return membersGoal;
    }

    public void setMembersGoal(int membersGoal) {
        this.membersGoal = membersGoal;
    }

    public Duration getEDuration() {
        return eDuration;
    }

    public void setEDuration(Duration eDuration) {
        this.eDuration = eDuration;
    }

    public HashSet<Duration> getEDurations() {
        return eDurations;
    }

    public void setEDurations(HashSet<Duration> eDurations) {
        this.eDurations = eDurations;
    }
}
