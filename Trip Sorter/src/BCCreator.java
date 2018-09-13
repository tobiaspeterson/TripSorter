import java.util.ArrayList;
import java.util.Scanner;

public class BCCreator {
    ArrayList<BoardingCard> unSortedBCs = new ArrayList<BoardingCard>();

    public ArrayList<BoardingCard> createBCs(){
        System.out.printf("%nChoose set of unsorted boardingcards %nPress 1 to use an incomplete set of 4 unsorted boardingcards %n" +
                "Press 2 to create your own customized set of boardingcards manually %nPress anything else to use a complete set of 4 unsorted boardingcards %n");

        Scanner scanChoiceOfBCSet = new Scanner(System.in);
        String choiceOfBCSet = scanChoiceOfBCSet.nextLine().trim();

        directToChosenSetCreator(choiceOfBCSet);

        scanChoiceOfBCSet.close();

        return unSortedBCs;
    }

    public void directToChosenSetCreator(String typeOfBCSet){
        switch (typeOfBCSet){
            case "1":
                incompleteSetOfBCS();
                break;
            case "2":
                createOwnSetOfBCs();
                break;
            default:
                completeSetOfBCs();
                break;
            }
    }

    public void incompleteSetOfBCS(){
        BoardingCard BC1 = new BoardingCard("Malmö", "Flen", "train 2048", "platform 3", "a21",null);
        BoardingCard BC2 = new BoardingCard("Athens", "Copenhagen", "flight U18", "gate 11", "3C", "52");
        BoardingCard BC3 = new BoardingCard("Copenhagen", "Malmö", "bus 311", "stop C", null, null);
        BoardingCard BC4 = new BoardingCard("Stockholm", "Kiruna", "train 1012", "platform 7", null, null);

        unSortedBCs.add(BC1);
        unSortedBCs.add(BC2);
        unSortedBCs.add(BC3);
        unSortedBCs.add(BC4);
    }

    public void createOwnSetOfBCs(){
        String addBC = "Y";

        while (addBC.equals("Y")){
            addNewBC();

            Scanner scanCreateAnotherBC = new Scanner(System.in);
            System.out.printf("%nEnter Y to create another boardingcard, enter anything else to start the sorting %n");
            addBC = scanCreateAnotherBC.nextLine().toUpperCase().trim();
        }
    }

    public void addNewBC(){
        String start;
        String destination;
        String transportation;
        String platformOrGate;
        String seat;
        String bagageDrop;

        Scanner scanBCInfo = new Scanner(System.in);

        System.out.printf("%nPlease enter the start location of this boardingcard %n");
        start = scanBCInfo.nextLine().trim().toUpperCase();

        System.out.printf("%nPlease enter the destination %n");
        destination = scanBCInfo.nextLine().trim().toUpperCase();

        System.out.printf("%nPlease enter the type of transportation and the number, e.g. train 1111 %n");
        transportation = scanBCInfo.nextLine().trim();

        System.out.printf("%nPlease enter the platform, gate or bus stop name/number. The following are examples of each: gate F3, platform 2 or stop C %n");
        platformOrGate = scanBCInfo.nextLine().trim();

        System.out.printf("%nPlease enter the seat or type null if the seating is not pre booked %n");
        seat = scanBCInfo.nextLine().trim();

        System.out.printf("%nPlease enter the bagagedrop counter if there is one, type null if there is no bagagedrop %n");
        bagageDrop = scanBCInfo.nextLine().trim();

        BoardingCard NewBC = new BoardingCard(start, destination, transportation, platformOrGate, seat, bagageDrop);
        unSortedBCs.add(NewBC);
    }

    public void completeSetOfBCs(){
        BoardingCard BC1 = new BoardingCard("Malmö", "Stockholm", "train 2048", "platform 3", "a21","null");
        BoardingCard BC2 = new BoardingCard("Athens", "Copenhagen", "flight U18", "gate 11", "3C", "52");
        BoardingCard BC3 = new BoardingCard("Copenhagen", "Malmö", "bus 311", "stop C", "null", "null");
        BoardingCard BC4 = new BoardingCard("Stockholm", "Kiruna", "train 1012", "platform 7", "null", "null");

        unSortedBCs.add(BC1);
        unSortedBCs.add(BC2);
        unSortedBCs.add(BC3);
        unSortedBCs.add(BC4);
    }
}
