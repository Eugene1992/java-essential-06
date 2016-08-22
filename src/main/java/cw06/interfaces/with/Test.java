package cw06.interfaces.with;

public class Test {
    public static void main(String[] args) {
        Movable dog = new HomeDog(20);
        Movable car = new MercedesBenz(200);
        printDistances(new Movable[]{dog, car}, 2);
    }

    static void printDistances(Movable[] units, int hours){
        for (Movable unit : units) {
            System.out.println(unit.getDistance(hours));
        }
    }
}
