///*********************************************************************************
/// Brennan Morse 2/1/2023 Activity 9
///*********************************************************************************

import java.util.Random;
import java.util.Scanner;
public class Activity9 {
    public static void main(String[] args) {
        Random random = new Random();
        int counter = 0;
        int correct = 0;
        String color;

        Scanner keyboard = new Scanner(System.in);

        while (counter < 10)
        {
            int randomInt = random.nextInt(5);
            if (randomInt == 0) {
                color = "red";
            }
            else if (randomInt == 1) {
                color = "green";
            }
            else if (randomInt == 2)
            {
                color = "blue";
            }
            else if (randomInt == 3){
                color = "orange";
            }else{
            //else if (randomInt == 4)
                color = "yellow";
            }

            System.out.println(counter + " What color has the computer chosen?: ");
            String guess = keyboard.nextLine();

            if (guess.equals(color)) {
                correct += 1;
            }


            System.out.println("The computer chose " + color);
            counter += 1;



        }

        System.out.println("You got " + correct + " out of 10 correct");






    }
}
