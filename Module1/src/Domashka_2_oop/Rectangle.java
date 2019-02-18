package Domashka_2_oop;

public class Rectangle implements findSquare<Integer>, findPerimeter<Integer> {
    private Point corner1;
    private Point corner2;

    public Rectangle(Point corner1, Point corner2) {
        this.setCorner1(corner1);
        this.setCorner2(corner2);
    }

    public Point getCorner1() {
        return corner1;
    }

    public void setCorner1(Point corner1) {
        this.corner1 = corner1;
    }

    public Point getCorner2() {
        return corner2;
    }

    public void setCorner2(Point corner2) {
        this.corner2 = corner2;
    }

    public double diagonal() {

        double res = this.getCorner1().distancePoint(this.getCorner1(), this.getCorner2());
        return res;
    }

    public int getSideA() {
        return Math.abs(this.getCorner1().getX() - this.getCorner2().getX());
    }

    public int getSideB() {
        return Math.abs(this.getCorner1().getY() - this.getCorner2().getY());
    }

    @Override
    public Integer getSquare() {
        return this.getSideA() * this.getSideB();
    }

    @Override
    public Integer getPerimeter() {
        return 2*(this.getSideA() + this.getSideB());
    }

    @Override
    public String toString() {
        return "это прямоугольник";
    }
}
