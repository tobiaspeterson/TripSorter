import java.util.ArrayList;

public class Printer {
    public void printTrip(ArrayList<BoardingCard> sortedBCs) {
        if (sortedBCs.size() == 0){
            System.out.printf("%nYour trip is incomplete, there could be 2 reasons for this. %nEither the amount of boardingcards is zero or a full trip cannot be connected using the provided list");
        }
        else {
            for (int i = 0; i < sortedBCs.size(); i++) {
                System.out.printf("%n%nTake " + sortedBCs.get(i).getTransportation() + " from " + sortedBCs.get(i).getStart()
                        + " to " + sortedBCs.get(i).getDestination() + " from " + sortedBCs.get(i).getPlatformOrGate() + ".");

                if (sortedBCs.get(i).getSeat().equals("null") == false) {
                    System.out.print(" Sit in seat " + sortedBCs.get(i).getSeat() + ".");
                } else {
                    System.out.print(" No seat assignment.");
                }

                if (sortedBCs.get(i).getBagageDrop().equals("null") == false) {
                    System.out.printf("%nBaggage drop at counter " + sortedBCs.get(i).getBagageDrop() + ".");
                }
            }
        }
    }

}
