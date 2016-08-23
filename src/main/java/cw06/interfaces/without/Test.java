package cw06.interfaces.without;

public class Test {
    public static void main(String[] args) {
        MovableUnit dog = new HomeDog(20);
        MovableUnit car = new MercedesBenz(200);
        printDistances(new MovableUnit[]{dog, car}, 2);
    }

    static void printDistances(MovableUnit[] units, int hours){
        for (MovableUnit unit : units) {
            System.out.println(unit.getDistance(hours));
        }
    }
}
