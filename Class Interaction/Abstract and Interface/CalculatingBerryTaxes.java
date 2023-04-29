package abstractClasses;

public class CalculatingBerryTaxes extends AbstractMain{

    private double percentOfBerriesOwedToTheIRS;
    public CalculatingBerryTaxes(String berry, int numberOfBerries, double percentOfBerriesOwedToTheIRS){
        super(berry, numberOfBerries);
        this.percentOfBerriesOwedToTheIRS = percentOfBerriesOwedToTheIRS;
    }

    public double getPercentOfBerriesOwedToTheIRS(){
        return percentOfBerriesOwedToTheIRS;
    }

    public void setPercentOfBerriesOwedToTheIRS(double percentOfBerriesOwedToTheIRS){
        this.percentOfBerriesOwedToTheIRS = percentOfBerriesOwedToTheIRS;
    }

    @Override
    public int numberOfBerriesOwedToTheIRS() {
        int numberOfBerries = getNumberOfBerries();
        return (int) (numberOfBerries * percentOfBerriesOwedToTheIRS);
    }
}
