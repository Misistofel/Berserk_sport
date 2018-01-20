package libs;

public class WorkWithArray {
   /* public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {           //i=i+1 eto to je chto i i++, mojno i=i+2
            System.out.println(array[i] + "");            //upravljajuschee uslovie cikla
        }
        System.out.println("");
    }

    public void comparisonArrayWithValue(int valueForComparison, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < valueForComparison) {
                System.out.println(array[i] + " less than " + valueForComparison);
            } else if (array[i] == valueForComparison) {
                System.out.println(array[i] + " equals  " + valueForComparison);
            } else {
                System.out.println(array[i] + " more than " + valueForComparison);
            }
        }
    }
//-----------My variant of HW-------------------------
    public int[][] myArray(int m, int n, int k) {
        //int m,n;//- вынесла эти переменные в сам метод
        int[][] matrixArray = new int[m][n];
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
             matrixArray[i][j]=k;
            }
        }
        return matrixArray;
    }

    public int[][] myArrayDiag(int[][] matrixArrayDia) {

        //int[][] matrixArrayD = new int[m][n];
        int i, j;
        for (i = 0; i < matrixArrayDia.length; i++) {
            for (j = 0; j < matrixArrayDia.length; j++) {

                if (i == j) {
                    matrixArrayDia[i][j] = 1;
                }
            }
        }
        for (i = 0; i < matrixArrayDia.length; i++) ;
        for (j = 0; j < matrixArrayDia.length; j++) ;

        {
            System.out.print(matrixArrayDia[i][j] + "  ");
            System.out.println();
            return matrixArrayDia;
        }
    }
}

//---------------second variant of HW by TARAS------------*/

    public int[][] createMatrix(int matrixSize, int defValue) {
        int[][] ourMatrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                ourMatrix[i][j] = defValue;
            }
        }
        printMatrix((ourMatrix));
        return ourMatrix;
    }

    public int[][] fillMatrixDiagonale(int[][] ourMatrix, int diagonaleValue) {
        if (ourMatrix.length == ourMatrix[0].length) {
            for (int i = 0; i < ourMatrix.length; i++) {
                for (int j = 0; j < ourMatrix[i].length; j++) {
                    if (i == j) {
                        ourMatrix[i][j] = diagonaleValue;
                    }
                }
            }
        } else {
            System.out.println("Error");
        }
        printMatrix(ourMatrix);
        return ourMatrix;
    }

    private void printMatrix(int[][] matrixForPrint) {
        for (int i = 0; i < matrixForPrint.length; i++) {
            for (int j = 0; j < matrixForPrint[i].length; j++) {
                System.out.print(matrixForPrint[i][j] + " ");
            }
            System.out.println("");

        }
        System.out.println("");
    }
}

// ------------------Prosto primer iz ineta----------------
    /*
    vsju matricu 1111 zapolnit
    public void MyArray(String args[]) {
        int N = 5;
        int twoD[][] = new int[N][N];
        int i, j = 0;

        for (i = 0; i < N; i++)
            for (j = 0; j < N; j++) {
                twoD[i][j] = 1;
            }
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++)
                System.out.print(twoD[i][j] + "  ");
            System.out.println();
        }
  */



