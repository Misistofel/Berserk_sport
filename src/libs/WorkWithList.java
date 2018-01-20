package libs;

import java.util.ArrayList;
import java.util.List;

public class WorkWithList extends WorkWithListAbstract {//alt enter - i realizovali metody


    @Override
   public List<List<String>> addNewList(List<List<String>> ourList) {
        ourList.add(new ArrayList<>());  //new ArrayList sozdal pustoi spisok//Array list otlich ot Lista tem chto List
        // eto opisanie togo kakim budet List, a List - eto fizicheskaja realizacija
        printListList(ourList);   //est takoi metod dlia spiska - "printListList" my sozdali v klasse WorkWithListAbstract
        //"List" eto tip takou kak i"int" no on mpjet byt string i int i ih mnogo, a int - odin
        return ourList;
    }

    @Override
   public List<List<String>> addValueToListList(int numberOfList, String value, List<List<String>> ourList) {
        ourList.get(numberOfList).add(value);
        //numberOfList - nomer stroki v liste// Napisali:spisok dai stroku i dobav znachenie

        try {                                           //a esli stroki net to:
            ourList.get(numberOfList).add(value);
        } catch (Exception e) {         //Exceptione  - e - eto vse exceptions
            System.out.println("Error" + e);
        }
        printListList(ourList);
        return ourList;
    }

    @Override
    void printListList(List<List<String>> ourList) {   //vyvodit ListListov
        System.out.println("----------------");
        for (List<String> listForPrint : ourList) {              //beri elementy Lista i zapisivai v perem ListForPrint
            System.out.println(listForPrint);   //vivedet stolko znacheniy skolko ih v ourList - perebor elementov massiva
        }
    }
}
//Idem v Main
