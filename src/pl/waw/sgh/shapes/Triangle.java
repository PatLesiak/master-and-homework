package pl.waw.sgh.shapes;

public class Triangle extends Shape {
    public Triangle(Double parA, Double parB) {
        super(parA, parB);
    }

    public Double calcSurface() {
        return parA*parB*1/2;
    }

    @Override
    public Double calcPerimeter() {
        return parA+parB;
    }
}
