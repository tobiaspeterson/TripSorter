import java.util.*;

public class BoardingCard {
    private String start;
    private String destination;
    private String transportation;
    private String platformOrGate;
    private String seat;
    private String bagageDrop;

    BoardingCard(String start, String destination, String transportation, String platformOrGate, String seat, String bagageDrop) {
        this.start = start.toUpperCase();
        this.destination = destination.toUpperCase();
        this.transportation = transportation;
        this.platformOrGate = platformOrGate;
        this.seat = seat;
        this.bagageDrop = bagageDrop;
    }

    public String getStart() {
        return this.start;
    }
    public String getDestination() {
        return this.destination;
    }
    public String getTransportation() {
        return this.transportation;
    }
    public String getPlatformOrGate() {
        return this.platformOrGate;
    }
    public String getSeat() {
        return this.seat;
    }
    public String getBagageDrop() {
        return this.bagageDrop;
    }
}
