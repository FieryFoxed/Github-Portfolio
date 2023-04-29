package interfaces;

public class collection {
    public static void main(String[] args) {
        berriesTaken amountLost = new berriesTaken(100, 500);
        System.out.println("You got " + amountLost.berriesObtained() + " berries! However the IRS took the rest...");


        berriesKept amountLaundered = new berriesKept(.90, 200);
        System.out.println("You laundered " + amountLaundered.berriesObtained() + " berries! The IRS got the rest though...");
    }
}
