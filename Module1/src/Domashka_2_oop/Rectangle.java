package Domashka_2_oop;

public class Rectangle {
    static Point corner1;
    static Point corner2;

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

        double res = this.getCorner2().distancePoint(this.getCorner1(), this.getCorner2());
        System.out.println(this.getCorner1().getX() + " " + this.getCorner1().getY());
        System.out.println(this.getCorner2().getX() + " " + this.getCorner2().getY());
        return res;
    }


}
