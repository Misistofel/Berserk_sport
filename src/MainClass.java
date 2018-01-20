import currency.Bitcoin;
import currency.Dollar;
import currency.Euro;
import libs.LibClass;
import libs.WorkWithArray;
import libs.WorkWithList;

import java.util.ArrayList;                  //alt-entar - import
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static libs.LibClass.sum;


public class MainClass {
    public static void main(String[] arg) {
        System.out.println("Hello !");
//        int var1;
//        var1=5;
//        int var2=10;
//        int rez_1;
//        rez_1 = var1+var2;
//        System.out.println(rez_1);
//        instead on this create method
        sum(5, 10);

//        int var3=15, var4=20;
//        System.out.println(var3+var4);
        sum(15, 20);
        sum("Test", " 123");
        sum("777", 5);
        sum(5, "89");
        System.out.println(sum(5, "8a9"));
        System.out.println("test");

        LibClass libClass;//namerenie chto v perem LibClass polo;jit hotim ...
        libClass = new LibClass();//fizicheski videlim mesto pamjati
        libClass.multiplication(2, 3);
        libClass.devision(3.2, 3);


        try {
            libClass.divByte((byte) 2, (byte) 0);
        } catch (ArithmeticException e) {
            System.out.println("Error in main");
            System.out.println("Error");

            //MASSIV
           /* int[] ourArray = {2, 4, 26, 7, 28, 10, 9, 20, 33};
            System.out.println("Test" + ourArray[6]);

            WorkWithArray workWithArray = new WorkWithArray();
            workWithArray.printArray(ourArray);

            int[] secondArray = {3, 5};
            workWithArray.printArray(secondArray);

            //nejavno zadam massiv
            int[] thirdArray = new int[10];//sozdali massiv na 10 elementov, no ne zadali ih
            thirdArray[0] = 1;
            workWithArray.comparisonArrayWithValue(7, secondArray);*/

            //-----------------------------
            /*HW3
            int[][] homeArray;
            homeArray =  workWithArray.myArray(3,3,0);
            workWithArray.myArrayDiag(homeArray);

            /*------------------------------HW by TARAS-------------*/

            WorkWithArray workWithMatrix = new WorkWithArray();
            int[][] temp = workWithMatrix.createMatrix(5, 8);
            workWithMatrix.fillMatrixDiagonale(temp, 7);

            workWithMatrix.fillMatrixDiagonale(temp, 10);


        }
//dinamichesky spisok
    /*    List<String> ourList;
        ourList = new ArrayList();
        ourList.add("test");
        ourList.add("test1");
        System.out.println(ourList);//
      /*  System.out.println(ourList.get(1));
        for (int i = 0; i < ourList.size(); i++) {
            System.out.println(ourList.get(i));
        }
        for (String elementOfList : ourList
                ) {
            System.out.println(elementOfList);
        }
        List<List<String>> ourListList=new ArrayList<>();
        ourListList.add(ourList);
        System.out.println(ourListList);
        ourListList.add(ourList);
        System.out.println(ourListList);
        ourListList.get(1).add("test33");
        System.out.println(ourListList);
        List<String> ourList1=new ArrayList<>();
        ourList1.add("test");
        ourList1.add("test2");
        ourList1.add("test33");
        System.out.println(ourList==ourList1);//sravnenie kubikov: =prisvoenie-pravoe zapisyvaet v levoe, ==logicheskoe sravnenie
        System.out.println(ourList.equals(ourList1));//sravnenie

        //tip dannyh Mapa
        Map<String,String> ourMap=new HashMap<>();
        ourMap.put("login","test1");
        ourMap.put("login","test2");//kljuch perezapisal znachenie
        System.out.println(ourMap);
        System.out.println("size="+ourMap.size());
        ourMap.put("pass","pass1");
        System.out.println(ourMap);
        ourMap.put("ass1","pass11");
        System.out.println(ourMap);

        List<Map<String,String>>ourListOfMap=new ArrayList<>();
        ourListOfMap.add(ourMap);
        System.out.println(ourListOfMap);
        System.out.println(ourMap.get("login"));   */


        // -----------List-------------------------
        WorkWithList workWithList = new WorkWithList();  //sozdali obekt

        List<List<String>> ourListList1 = new ArrayList<>();      //sozdali pustoi spisok
        workWithList.addNewList(ourListList1);  // - dobavili pustuju stroku v nash spisok i napechatali ee
        workWithList.addValueToListList(0, "test", ourListList1); //dobavliaet znachenija i vyvodit na ekran
        workWithList.addNewList(ourListList1);// dobavliaet 1 stroku
        workWithList.addValueToListList(1, "test1", ourListList1);// i dobavil v nee znachenie
        workWithList.addValueToListList(0, "test0", ourListList1); //v nulevuju stroku dobavili esche odno znachenie


        // -------------------Currency-------------------
        Dollar dollar = new Dollar("Dollar",26.2,1.2,0.8);                  //v (dat znachenie)
        System.out.println(dollar.getKursNBU());
        dollar.setKursNBU(27.15);
        dollar.getFreelyConv();

        System.out.println("Freely or not freely convert"+dollar.getFreelyConv());
        System.out.println(dollar.getKursNBU());
        dollar.exchangeCurrencyToGrn(100);

        Bitcoin bitcoin=new Bitcoin("Bitcoin",200000,0.8,1.1);
        System.out.println("Bitcoin kurs "+ bitcoin.getKursNBU());
        bitcoin.exchangeGrnToCurrency(1000);
        bitcoin.exchangeCurrencyToGrn(1);


                Euro euro = new Euro("Euroo",30,1.3,0.7);
                final String nameEvro="euro";
                System.out.println("euro" + euro.getKursNBU());
                euro.setKursNBU(32);
                System.out.println(nameEvro + euro.getKursNBU());




                dollar.setKursNBU(18);
                euro.setKursNBU(20);
                final String nameDollar = "Dollar";
        System.out.println(nameDollar+dollar.getKursNBU() + nameEvro+euro.getKursNBU());
        dollar.exchangeGrnToCurrency(1000);

    }

    }











