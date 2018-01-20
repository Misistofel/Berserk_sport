package libs;

import java.util.List;///List-klikni na nego i alt_enter

abstract public class WorkWithListAbstract {                  //created abstract class -
// vse ego naslegniki doljni unasledovat VSE metody etogo klassa - tak my zadaem structuru klassa

           /**
         *Method will add new List<String> to List
         */
        abstract List<List<String>> addNewList(List<List<String>> ourList);
        /**
         * Method should add value to some List
         * @param numberOfList
         * @param value
         */
        abstract List<List<String>> addValueToListList(int numberOfList, String value , List<List<String>> ourList);
        /**
         * Method should print Every List on new line
         */
        abstract void printListList(List<List<String>> ourList);
    }

