import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        BCCreator creator = new BCCreator();
        ArrayList<BoardingCard> unsortedBCs = creator.createBCs();

        BCSorter sorter = new BCSorter();
        ArrayList<BoardingCard> sortedBCs = sorter.sort(unsortedBCs);

        Printer printer = new Printer();
        printer.printTrip(sortedBCs);

    }
}
