package localvariables;

public class DistanceMain {

    public static void main(String[] args) {
        Distance distance = new Distance(15.2,true);
        System.out.println("A távolság: " + distance.getDistanceInKm() + ", a pontossága: " + distance.isExact());
        int i = (int) distance.getDistanceInKm();
        System.out.println(i);

    }
}
