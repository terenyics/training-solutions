package arrayofarrays;

public class ArrayOfArraysMain {

    public static void main(String[] args) {
        ArrayOfArraysMain arrayOfArraysMain = new ArrayOfArraysMain();
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.multiplicationTable(5));
    }

    public int[][] multiplicationTable(int size) {
        int[][] multiplicationTable = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        return multiplicationTable;
    }

    public void printArrayOfArrays(int[][] a) {
        for (int[] i : a) {
            for (int j : i) {
                if (j < 10) {
                    System.out.print("  ");
                } else if (j < 100) {
                    System.out.print(" ");
                }
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}
