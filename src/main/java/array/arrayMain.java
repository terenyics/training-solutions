package array;

public class arrayMain{
    public static void main(String[] args) {

        String [] daysOfWeek = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        System.out.println(daysOfWeek [1]);
        System.out.println(daysOfWeek.length);

        int[] powersOfTwo = new int[5];
        powersOfTwo[0] = 1;
        for (int i = 1; i < powersOfTwo.length; i++) {
            powersOfTwo[i] = powersOfTwo[i - 1] * 2;
        }

        for (int i = 0; i < powersOfTwo.length; i++) {
            System.out.println(powersOfTwo[i] + " ");
        }

        boolean[] bools = new boolean[6];
        for (int i = 1; i < bools.length; i++) {
            bools[i] = !bools[i - 1];
        }

        for (int i = 0; i < bools.length; i++) {
            System.out.println(bools[i]);
        }



    }


}
