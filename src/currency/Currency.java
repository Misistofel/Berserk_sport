package currency;

abstract public class Currency {


    double rateSell, rateBuy;
    double kursSell, kursBuy;
    String nameOfCurrency;


    double kursNBU;              //alt insert sozdaet constructor--> getter and setter

    //----constructor--eto metod

    public Currency(String nameOfCurrency, double kursNBU, double rateBuy, double rateSell) {             //kersNBU - 2 raznyh peremennyh

        this.kursNBU = kursNBU;                     //v klasse Currency vozmi peremennuju i peredai v nee to chto pridet  izvne
        this.rateBuy = rateBuy;
        this.rateSell = rateSell;
        this.nameOfCurrency=nameOfCurrency;
        kursBuy = kursNBU * rateBuy;
        kursSell = kursNBU * rateSell;
    }

    public double getKursNBU() {       //pojavilis metody getter i setter - vyrezali i perenesli sjuda
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
        updateKurseSellAndBuy();
    }

    public double getRateSell() {
        return rateSell;
    }

    public void setRateSell(double rateSell) {
        this.rateSell = rateSell;
    }

    public double getRateBuy() {
        return rateBuy;
    }

    public void setRateBuy(double rateBuy) {
        this.rateBuy = rateBuy;
        updateKurseSellAndBuy();
    }

    public double getKursSell() {
        return kursSell;
    }

    public double getKursBuy() {
        return kursBuy;
    }



    private void updateKurseSellAndBuy() {
        kursBuy = kursNBU * rateBuy;
        kursSell = kursNBU * rateSell;
    }

    public double exchangeGrnToCurrency(int grn) {
        double tempResult;
        tempResult = grn / kursBuy;
        System.out.println("Curse " + kursBuy + " For " + grn + "you get " + tempResult+nameOfCurrency);
        return tempResult;
    }

    //--------HW4-----sozdaju metod , kotoryi menjaet Currency n GRN----------------------

    public double exchangeCurrencyToGrn(double numberOfCurrency) {
    double tempResult=numberOfCurrency*kursSell;
        System.out.println("Kurs  "+kursSell+" For "+numberOfCurrency+nameOfCurrency+" you get  " + tempResult);
        return tempResult;
    }
}



