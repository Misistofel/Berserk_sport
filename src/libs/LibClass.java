package libs;

public class LibClass {
    public static void sum(int var11, int var12) {
        System.out.println(var11 + var12);
    }

    public static void sum(String var13, String var14) {
        System.out.println(var13 + var14);
    }

    public static void sum(String var15, int var16) {
        System.out.println(var15 + var16);
    }

    public static int sum(int varInteger, String varString) {
        int tempResult;
        try {
            tempResult = varInteger + Integer.parseInt(varString);//"789" -->789; if "7a89"-->cant transfer a to numbers
            return tempResult;
        } catch (NumberFormatException e) {
            System.out.println("Error");
            return 88888;
        } catch (Exception e) {
            System.out.println("Error");
            return 99999;
        }
    }
    public void multiplication(int mnojitel_1, int mnojitel_2) {
        System.out.println(mnojitel_1 * mnojitel_2);
    }

    /* public void division(int dilene, int dilnyk){
         System.out.println(dilene/dilnyk); }*/
    public static int devision(int dilene, int dilnyk) {
        int chastka;
        try {
            chastka = dilene / dilnyk;
            return chastka;
        } catch (ArithmeticException e) {
            System.out.println("Forbidden devision on 0");
            return dilene;
        } catch (Exception e) {
            System.out.println("Error");
            return 99999;

        }
    }
   public double devision(double dilene1, double dilnyk1){
   try{
        double chastka=dilene1 / dilnyk1;
        System.out.println(chastka);
        return chastka;
    }catch (Exception e){
        System.out.println("Error"+e);
    return 99999;
    }
   }

    /**
     *
     *
     * @param dilene2
     * @param dilnyk2
     * @return
     * @throws ArithmeticException
     */
    public byte divByte (byte dilene2, byte dilnyk2) throws ArithmeticException{//tut budet exception pri 2/0 no vybrositsa na uroven vyshe
       return (byte) (dilene2/dilnyk2);//tut (byte) - privedenie tipov
  }
}


