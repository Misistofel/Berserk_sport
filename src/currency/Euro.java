package currency;

public class  Euro extends Currency implements IsFreelyConver {
    public Euro(String nameOfCurrency,double kursNBU, double rateBuy, double rateSell) {
        super(nameOfCurrency,kursNBU, rateBuy, rateSell);
    }


   /* public Euro(double kursNBU) {
        super(kursNBU);
    }*/

    @Override
    public boolean getFreelyConv() {
        return true;
    }
}
