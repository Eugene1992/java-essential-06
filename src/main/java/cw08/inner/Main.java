package cw08.inner;

public class Main {
    public static void main(String[] args) {
        Ship.Engine engine = new Ship("Titanik").new Engine();
        System.out.println(engine.getShipName());
    }
}
