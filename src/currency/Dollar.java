package currency;

public class Dollar extends Currency implements IsFreelyConver{
        public Dollar(String nameOfCurrency,double kursNBU, double rateBuy, double rateSell) {
        super(nameOfCurrency,kursNBU, rateBuy, rateSell);
    }             //navodim na Currency-->alt enter -->create constructor kak u roditelja

 /*   public Dollar(double kursNBU) {
 //       super(kursNBU);            //super curs - eto obraschenie k roditelju; Kogda dobavili v
 currency esche peremennye, udalili etot constructor i dobavili novyi
    }*/

    @Override
    public boolean getFreelyConv() {
        return true;
    }
}
