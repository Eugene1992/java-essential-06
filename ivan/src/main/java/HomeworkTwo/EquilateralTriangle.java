package HomeworkTwo;

public class EquilateralTriangle extends  Triangle {
    public EquilateralTriangle(double lagA) {
        super(lagA);
    }

    double areaOfShape() {
        double areaOfEquilatTri = (lagA * Math.sqrt(3))/4;
        return areaOfEquilatTri;
    }
}
