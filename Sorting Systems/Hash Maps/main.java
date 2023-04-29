public class main {
    public static void main(String[] args) {
        HashClass hash = new HashClass();

        hash.addToEggControl(1, "Blue Egg");
        hash.addToEggControl(2, "Red Egg");
        hash.addToEggControl(3, "Yellow Egg");

        hash.displayEgg();

        hash.removeFromEggControl(3);

        hash.displayEgg();
    }
}
