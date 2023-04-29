package abstractClasses;

public class YearsInJailForBerryTaxEvasion extends AbstractMain{
    private int berriesPaid;

    public YearsInJailForBerryTaxEvasion(String berry, int numberOfBerries, int berriesPaid ){
        super(berry, numberOfBerries);
        this.berriesPaid = berriesPaid;
    }

    public int getBerriesPaid(){
        return berriesPaid;
    }

    public void setBerriesPaid(int berriesPaid){
        this.berriesPaid = berriesPaid;
    }

    @Override
    public int numberOfBerriesOwedToTheIRS(){
        int paid = getBerriesPaid();
        int numberOfBerries = getNumberOfBerries();

        return (int) numberOfBerries - berriesPaid;

    }
}


