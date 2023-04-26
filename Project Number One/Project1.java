import java.util.Scanner;
import java.util.Random;
///*********************************************************************************
/// Brennan Morse 2/10/2023 Project 1
///*********************************************************************************
public class Project1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int roundCount = 0;
        int P1W = 0;
        int P2W = 0;

        System.out.println("Enter an odd number of rounds: ");
        int oN = Integer.parseInt(keyboard.nextLine());

        //COLLECTING STATS//=======================================================

        while (roundCount < oN) {
            roundCount += 1;
            System.out.println("Round " + roundCount);
            System.out.println("Enter player ones pokemon stats=========");

            System.out.println("Enter your pokemon's name: ");
            String name = keyboard.nextLine();

            System.out.println("Enter your pokemon's HP: ");
            int HP = Integer.parseInt(keyboard.nextLine());

            System.out.println("Enter a move: ");
            String move1 = keyboard.nextLine();

            System.out.println("Enter the moves power: ");
            int move1P = Integer.parseInt(keyboard.nextLine());

            System.out.println("Enter your pokemon's attack speed: ");
            int speed1 = Integer.parseInt(keyboard.nextLine());
            System.out.println();
            System.out.println("Enter player twos pokemon stats=========");

            System.out.println("Enter your pokemon's name: ");
            String name2 = keyboard.nextLine();

            System.out.println("Enter your pokemon's HP: ");
            int HP2 = Integer.parseInt(keyboard.nextLine());

            System.out.println("Enter a move: ");
            String move2 = keyboard.nextLine();

            System.out.println("Enter the moves power: ");
            int move2P = Integer.parseInt(keyboard.nextLine());

            System.out.println("Enter your pokemon's attack speed: ");
            int speed2 = Integer.parseInt(keyboard.nextLine());

            //COMBAT SECTION//=======================================================
            if (speed1 > speed2) {
                while (HP >= 1 && HP2 >= 1) {
                    if (HP > 0) {
                        HP2 = HP2 - move1P;
                    }
                    if (HP2 > 0) {
                        HP = HP - move2P;
                    }
                    if (HP <= 0) {
                        System.out.println("Player 2's " + name2 + " ins this battle");
                        P2W += 1;
                    } else {
                        System.out.println("Player 1's " + name + " wins this battle");
                        P1W += 1;
                    }
                }
            } else if (speed2 > speed1) {
                while (HP >= 1 && HP2 >= 1) {
                    if (HP2 > 0) {
                        HP = HP - move2P;
                    }
                    if (HP > 0) {
                        HP2 = HP2 - move1P;
                    }
                    if (HP <= 0) {
                        System.out.println("Player 2's " + name2 + " ins this battle");
                        P2W += 1;
                    } else {
                        System.out.println("Player 1's " + name + " wins this battle");
                        P1W += 1;
                    }
                }
            } else {
                int randomInt = random.nextInt(3);
                if (randomInt == 1) {
                    while (HP >= 1 && HP2 >= 1) {
                        if (HP > 0) {
                            HP2 = HP2 - move1P;
                        }
                        if (HP2 > 0) {
                            HP = HP - move2P;
                        }
                        if (HP <= 0) {
                            System.out.println("Player 2's " + name2 + " ins this battle");
                            P2W += 1;
                        } else {
                            System.out.println("Player 1's " + name + " wins this battle");
                            P1W += 1;
                        }
                    }
                } else {
                    while (HP >= 1 && HP2 >= 1) {
                        if (HP2 > 0) {
                            HP = HP - move2P;
                        }
                        if (HP > 0) {
                            HP2 = HP2 - move1P;
                        }
                        if (HP <= 0) {
                            System.out.println("Player 2's " + name2 + " wins this battle");
                            P2W += 1;
                        } else {
                            System.out.println("Player 1's " + name + " wins this battle");
                            P1W += 1;
                        }
                    }
                }
            }


        }
        System.out.println("player ones score: " + P1W);
        System.out.println("player twos score: " + P2W);

        if (P2W > P1W) {
            System.out.println("Player Two wins!");
        } else {
            System.out.println("Player One wins!");
        }
    }
}
