import java.util.Scanner;

public class Main {
    public static void pointsCalculator() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter Speed");
        double speed = Double.parseDouble(myObj.nextLine());

        System.out.println("Enter speed limit");
        int speedLimit = Integer.parseInt(myObj.nextLine());

        SpeedingPoints speedingPoints = new SpeedingPoints();
        speedingPoints.checkPoints( speed, speedLimit);
        System.out.println(speedingPoints.getOutcomeStr( speed, speedLimit));
    }


    public static void taxCalculator() {
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.calcTax(13000);
        //Should return £86 (you also pay £143 NI)
        System.out.println(taxCalculator.getTax());

        taxCalculator.calcTax(40000);
        //Should return £5486 (you also pay £3496 NI)
        System.out.println(taxCalculator.getTax());

        taxCalculator.calcTax(60000);
        //Should return £11,432 (you also pay £5,006 NI)
        System.out.println(taxCalculator.getTax());

        taxCalculator.calcTax(160000);
        //Should return £56,960  (you also pay  £7,423 NI)
        System.out.println(taxCalculator.getTax());
    }

    public static void main(String[] args) {
        taxCalculator();
        pointsCalculator();
    }
}