package homework02;

/**
 * @TODO Javadoc
 * Created by User on 20.08.16.
 */
final class Square extends Rectangle {
   // private static final double MAXSIZE = 10000d;
    private double side;

    Square(double side, String name) {
        if (side > 0 && side< MAXSIZE){
            this.side = side;
        }
        else {
            throw new IllegalArgumentException("Illegal input!");
        }
        this.setName(name);
    }

    @Override
    double getArea(){
        return side*side;
    }
}
