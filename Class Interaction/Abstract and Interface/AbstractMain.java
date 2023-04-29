package abstractClasses;

public abstract class AbstractMain {
    private String berry;
    private int numberOfBerries;

    public AbstractMain(String berry, int numberOfBerries){
        this.berry = berry;
        this.numberOfBerries = numberOfBerries;
    }

    public String getBerry(){
        return getBerry();
    }

    public void setBerry(String berry){
        this.berry = berry;
    }

    public int getNumberOfBerries(){
        return numberOfBerries;
    }

    public void setNumberOfBerries(int numberOfBerries){
        this.numberOfBerries = numberOfBerries;
    }



    @Override
    public String toString() {
        return String.format("Type of berry: %s%nNumber of berries: %s%nNumber of berries owed to the IRS", berry, numberOfBerries);
    }


    public abstract int numberOfBerriesOwedToTheIRS();


}


