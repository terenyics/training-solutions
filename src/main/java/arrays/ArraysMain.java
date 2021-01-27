package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public String numberOfDaysAsString () {
        int [] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public List<String> daysOfWeek() {
        return Arrays.asList("hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap");
    }

    public String multiplicationTableAsString (int size) {
        int [][] multiplicationTable = new int [size][size];
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++){
                        multiplicationTable [i][j] = (i + 1) * (j + 1);
                    }
                }
                return Arrays.deepToString(multiplicationTable);
        }

    public boolean sameTempValues (double[] day, double[] anotherDay) {
        return Arrays.equals(day,anotherDay);
    }

    public boolean wonLottery (int[] betNumbers, int[] winningNumbers) {
        int [] copyOfBetNumbers = Arrays.copyOf(betNumbers, betNumbers.length);
        int [] copyOfWinningNumbers = Arrays.copyOf(winningNumbers, winningNumbers.length);
        Arrays.sort(betNumbers);
        Arrays.sort(winningNumbers);
        return Arrays.equals(betNumbers, winningNumbers);
    }

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();

        System.out.println("numberOfDaysAsString");
        System.out.println(arraysMain.numberOfDaysAsString());

        System.out.println("daysOfWeek");
        System.out.println(arraysMain.daysOfWeek());

        System.out.println("multiplicationTableAsString");
        System.out.println(arraysMain.multiplicationTableAsString(5));

        System.out.println("sameTempValues");
        System.out.println(arraysMain.sameTempValues(new double[] {1, 2, 3}, new double[] {1, 2, 3}));

        System.out.println("wonLottery");
        System.out.println(arraysMain.wonLottery(new int[] {1, 2, 3}, new int[] {2, 1, 3}));
        System.out.println();

        int [] betNumbers = new int[]{1, 2, 3, 4, 5};
        int [] winningNumbers = new int[]{1, 4, 3, 2, 5};
        System.out.println(arraysMain.wonLottery(betNumbers, winningNumbers));
        System.out.println(Arrays.toString(winningNumbers));

    }
}
