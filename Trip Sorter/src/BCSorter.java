import java.util.ArrayList;

public class BCSorter {

    boolean incompleteTrip = false;

    public ArrayList<BoardingCard> sort(ArrayList<BoardingCard> unSortedBCs){
        ArrayList<BoardingCard> sortedBCs = new ArrayList<BoardingCard>();
        sortedBCs.add(unSortedBCs.get(0));
        unSortedBCs.remove(0);

        while (unSortedBCs.size() != 0 && incompleteTrip == false) {
            addNewBCToSorted(sortedBCs, unSortedBCs);
        }
    return sortedBCs;
    }

    public void addNewBCToSorted(ArrayList<BoardingCard> sortedBCs, ArrayList<BoardingCard> unSortedBCs) {
        int i = 0;
        boolean BCAdded = false;

        while (i < unSortedBCs.size() && BCAdded == false) {
            if (sortedBCs.get(sortedBCs.size()-1).getDestination().equals(unSortedBCs.get(i).getStart())) {
                sortedBCs.add(unSortedBCs.get(i));
                unSortedBCs.remove(i);
                BCAdded = true;
            }
            else if (sortedBCs.get(0).getStart().equals(unSortedBCs.get(i).getDestination())) {
                sortedBCs.add(0, unSortedBCs.get(i));
                unSortedBCs.remove(i);
                BCAdded = true;
            }
            i++;
        }
        if (BCAdded == false){
            incompleteTrip = true;
            sortedBCs.removeAll(sortedBCs);
        }
    }
}
