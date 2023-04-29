package stringArrayList;

import java.util.ArrayList;

public class testForArray {
    public static void main(String[] args) {
        StringArrayList ArrayList = new StringArrayList();

        ArrayList.addCoolThing("dog");
        ArrayList.addCoolThing("cat");
        ArrayList.addCoolThing("clown");
        ArrayList.addCoolThing("spinning black hole");

        ArrayList.removeCoolThing("clown");


        String indexObtaining = ArrayList.getThings(2);
        System.out.printf("%nThe item in that index slot is: " + indexObtaining);

        int listSize = ArrayList.getSizeOfCoolThingsList();
        System.out.printf("%nThe size of the list is: " + listSize);

        ArrayList.displayCoolThingsList();
    }
}
