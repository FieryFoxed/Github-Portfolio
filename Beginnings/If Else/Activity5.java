import java.util.Scanner;
public class Activity5 {
    public static void main(String[] args) {
///*********************************************************************************
/// Brennan Morse 1/27/2023 Activity 5 - 1
///*********************************************************************************
        int vege;
        int glu;
        int veg;


        Scanner keyboard = new Scanner(System.in);

        System.out.println("Is anyone in your party a vegetarian? Enter 1 for YES 2 for NO");
        String vegetarian = keyboard.nextLine();
        vege = Integer.parseInt(vegetarian);

        System.out.println("Is anyone in your party a vegan? Enter 1 for YES 2 for NO");
        String vegan = keyboard.nextLine();
        veg = Integer.parseInt(vegan);

        System.out.println("Is anyone in your party gluten free? Enter 1 for YES 2 for NO");
        String gluten = keyboard.nextLine();
        glu = Integer.parseInt(gluten);

        if (vege == 2 && veg == 2 && glu == 2)
            System.out.println("Joe’s Gourmet Burgers");
        else if (vege == 1 && veg == 2 && glu == 2)
            System.out.println("Main Street Pizza Company, Corner Café, Mama’s Fine Italian, The Chef’s Kitchen");
        else if (vege == 2 && veg == 1 && glu == 2)
            System.out.println("Corner Café, The Chef’s Kitchen");
        else if (vege == 2 && veg == 2 && glu == 1)
            System.out.println("Main Street Pizza Company, Corner Café, The Chef’s Kitchen");
        else if (vege == 1 && veg == 1 && glu == 2)
            System.out.println("Corner Café, The Chef’s Kitchen");
        else if (vege == 2 && veg == 1 && glu == 1)
            System.out.println("Corner Café, The Chef’s Kitchen");
        else if (vege == 1 && veg == 2 && glu == 1)
            System.out.println("Main Street Pizza Company, Corner Café, The Chef’s Kitchen");
        else if (vege == 1 && veg == 1 && glu == 1)
            System.out.println("The Chef’s Kitchen");



    }
}
