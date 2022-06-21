package pl.waw.sgh.shapes;

public class EquTriangle extends Shape {
    public EquTriangle(Double parA)
    {
        super(parA, null);
    }

    public Double calcSurface() {
        return (Math.pow(parA, 2)*Math.sqrt(3))/2;
    }

    @Override
    public Double calcPerimeter() {
        return 3*parA;
    }
}
