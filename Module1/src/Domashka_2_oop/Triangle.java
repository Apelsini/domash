package Domashka_2_oop;

public class Triangle implements findSquare<Double>, findPerimeter<Double> {
    private Point corner1;
    private Point corner2;
    private Point corner3;

    public Triangle(Point corner1, Point corner2, Point corner3) {
        this.corner1 = corner1;
        this.corner2 = corner2;
        this.corner3 = corner3;
    }

    public Point getCorner1() {
        return corner1;
    }

    public Point getCorner2() {
        return corner2;
    }

    public Point getCorner3() {
        return corner3;
    }

    public void setCorner1(Point corner1) {
        this.corner1 = corner1;
    }

    public void setCorner2(Point corner2) {
        this.corner2 = corner2;
    }

    public void setCorner3(Point corner3) {
        this.corner3 = corner3;
    }

    public double getSideA() {
        return this.getCorner1().distancePoint(this.getCorner1(), this.getCorner2());
    }

    public double getSideВ() {
        return this.getCorner2().distancePoint(this.getCorner2(), this.getCorner3());
    }

    public double getSideС() {
        return this.getCorner3().distancePoint(this.getCorner3(), this.getCorner1());
    }

    @Override
    public Double getPerimeter() {
        return this.getSideA()+this.getSideВ()+this.getSideС();
    }

    @Override
    public Double getSquare() {
        // используем формулу Герона
        // сначала вычисляем p
        double sideA = this.getSideA();
        double sideB = this.getSideВ();
        double sideC = this.getSideС();
        //System.out.println("сторона 1="+sideA+" сторона 2="+sideB+" сторона 3="+sideC);
        Double p = 0.5f*(sideA+sideB+sideC);
        //System.out.println(" р ="+p);
        // затем вычисляем подкоренное выражение
        Double podkorennoe = Math.abs(p*(p-this.getSideA())*(p-this.getSideВ())*(p-this.getSideС()));
        //System.out.println(" подкоренное ="+podkorennoe);
        // и наконец берем корень
        return Double.valueOf(Math.sqrt(podkorennoe));
    }

    @Override
    public String toString() {
        return "это треугольник";
    }

}
