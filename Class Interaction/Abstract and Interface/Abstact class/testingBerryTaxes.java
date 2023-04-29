package abstractClasses;

public class testingBerryTaxes {
    public static void main(String[] args) {
        CalculatingBerryTaxes calculating = new CalculatingBerryTaxes("red berries", 123, 2.5);
        System.out.println(calculating.toString());
        System.out.printf("Number of berries owed to the IRS: " + calculating.numberOfBerriesOwedToTheIRS());

        YearsInJailForBerryTaxEvasion missingAmount = new YearsInJailForBerryTaxEvasion("blue berries", 300, 150);
        System.out.println(missingAmount.toString());
        System.out.printf("You will go to jail for " + missingAmount.numberOfBerriesOwedToTheIRS() + " years if you do not pay the rest of the berries owed.");
    }
}

