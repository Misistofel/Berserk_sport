package currency;

public class Bitcoin extends Currency  {

    public Bitcoin(String nameOfCurrency,double kursNBU, double rateBuy, double rateSell) {
        super(nameOfCurrency,kursNBU, rateBuy, rateSell);}

        public double exchangeCurrencyToGrn (double numberOfCurrency){
        System.out.println("Forbidden by Bank");
        return numberOfCurrency;
    }

}


