import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashClass {
    Map<Integer, String> eggControl = new HashMap<>();

    public void addToEggControl(int num, String egg){
        eggControl.put(num, egg);
    }

    public void removeFromEggControl(int num){
        eggControl.remove(num);
    }

    public Object getEgg(int num){
        Object egg;

        if(eggControl.containsKey(num)){
            egg = eggControl.get(num);
        }else{
            egg = "Egg not found";
        }
        return egg;
    }

    public void displayEgg(){
        eggControl.forEach((num, egg) ->{
            System.out.printf("Number: %d | Egg: %s\n", num, egg);
        });
    }

}





