package stringArrayList;
import java.util.ArrayList;

public class StringArrayList {
    ArrayList<String> coolThings = new ArrayList<>();

    public void addCoolThing(String thing)
    {
        coolThings.add(thing);
    }

    public void removeCoolThing(String thing)
    {
        coolThings.remove(thing);
    }

    public String getThings(int index)
    {
        return coolThings.get(index);
    }

    public int getSizeOfCoolThingsList()
    {
        return coolThings.size();
    }

    public void displayCoolThingsList()
    {
        System.out.printf("%nCool Things: ");
        for(int i = 0; i < coolThings.size(); i++)
        {
            System.out.printf("%s, ", coolThings.get(i));
        }
    }





}
