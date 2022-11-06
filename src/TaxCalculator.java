public class TaxCalculator {
    private double tax;
    private final int LOWER_LIMIT = 12570;
    private final int BASIC_RATE = 50270;
    private final int HIGHER_RATE = 150000;

    public double getTax() {
        return tax;
    }

    public void calcTax(int salary) {

     // double tax=0;

        System.out.println("Annual Income is : "+salary);
        if(salary<LOWER_LIMIT)
            tax=0;
        else if(salary<BASIC_RATE)
            tax=0.2*(salary-LOWER_LIMIT);
        else if(salary<HIGHER_RATE)
            tax=(0.4*(salary-BASIC_RATE))+(0.2*(BASIC_RATE-LOWER_LIMIT));
        else if(salary>=HIGHER_RATE)
            tax=(0.45*(salary-HIGHER_RATE))+(0.4*(HIGHER_RATE-(BASIC_RATE-LOWER_LIMIT)))+(0.2*(BASIC_RATE-LOWER_LIMIT));
        else
            System.out.println("There is an error");
//        System.out.println("Income tax amount is "+tax);
    }
        //Complete this method
        //Write appropriate comments throughout
    }

