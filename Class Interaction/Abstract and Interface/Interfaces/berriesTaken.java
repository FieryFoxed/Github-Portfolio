package interfaces;

public class berriesTaken implements berries{
    private int amountTakenByIRS;
    private int berriesCollected;

    public berriesTaken(int amountTakenByIRS, int berriesCollected){
        this.amountTakenByIRS = amountTakenByIRS;
        this.berriesCollected = berriesCollected;
    }

    public int getAmountTakenByIRS(){
        return amountTakenByIRS;
    }

    public void setAmountTakenByIRS(int amountTakenByIRS){
        this.amountTakenByIRS = amountTakenByIRS;
    }

    public int getBerriesCollected(){
        return berriesCollected;
    }

    public void setBerriesCollected(int berriesCollected){
        this.berriesCollected = berriesCollected;
    }


    public double berriesObtained() {
        return berriesCollected - amountTakenByIRS;
    }
}
