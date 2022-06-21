package pl.waw.sgh.shapes;

public class Diamond extends Shape {
    public Diamond(Double parA, Double parB) {
        super(parA, parB);
    }

    public Double calcSurface() {
        return parA*parB;
    }

    @Override
    public Double calcPerimeter() {
        return 4*parA;
    }
}
