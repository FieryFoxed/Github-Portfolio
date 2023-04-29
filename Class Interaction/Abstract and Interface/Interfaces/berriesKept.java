package interfaces;

public class berriesKept implements berries {
    private double percentLaundered;
    private int berriesCollected;

    public berriesKept(double percentLaundered, int berriesCollected) {
        this.percentLaundered = percentLaundered;
        this.berriesCollected = berriesCollected;
    }

    public double getPercentLaundered() {
        return percentLaundered;
    }

    public void setPercentLaundered(double percentLaundered) {
        this.percentLaundered = percentLaundered;
    }

    public int getBerriesCollected() {
        return berriesCollected;
    }

    public void setBerriesCollected(int berriesCollected) {
        this.berriesCollected = berriesCollected;
    }


    public double berriesObtained() {
        return berriesCollected * percentLaundered;
    }
}