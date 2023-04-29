import java.util.Scanner;
///******************************************************************************************************
/// Brennan Morse 1/27/2023 Activity 4 - 1
///******************************************************************************************************
public class Activity4 {
    public static void main(String[] args) {
        int number;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter 1-4: 1: Sunroot, 2: Sky Lily, 3: Hestier Vine, 4: Chocolate Bush: ");
        number = keyboard.nextInt();

        switch (number)
        {
            case 1 : System.out.println("Sunroot: grows underground, up to about 7 inches, when it reaches maturity, its leaves pop out of the ground.");
                break;
            case 2 : System.out.println("Sky Lily: Grows on the side of a tree, sucking sap from it. Grows to 2-5 inches, when it reaches maturity, it detaches from the tree and floats around with air currents to find a new climate.");
                break;
            case 3 : System.out.println("Hestier Vine, grows on the sides of large structure to get close to the sun, grows anywhere from 5 inches - 100 ft on average, the largest recorded vine grew nearly 170 feet!");
                break;
            case 4 : System.out.println("Chocolate Bush, grows 10 ft tall on average, grows in shady, dense wooden areas, very little sunlight is required. Sometimes bushes can be found growing in large groups of 20 or 30.");
                break;
            default :   System.out.println("Invalid selection.");
        }
    }
}
