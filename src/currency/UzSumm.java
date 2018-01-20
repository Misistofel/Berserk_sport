package currency;



public class UzSumm extends  Currency implements IsFreelyConver{
    public UzSumm(String nameOfCurrency,double kursNBU, double rateBuy, double rateSell) {
        super(nameOfCurrency,kursNBU, rateBuy, rateSell);
    }         //alt enter - sozdat konstructor

   /* public UzSumm(double kursNBU) {
        super(kursNBU);
    }*/

    @Override
    public boolean getFreelyConv() {
        return false;
    }
}
