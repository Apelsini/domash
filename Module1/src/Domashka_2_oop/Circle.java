package Domashka_2_oop;

public class Circle implements findSquare<Double> {
    private Point radius;
    private Point center;

    public Circle(Point center, Point radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }


    public Point getRadius() {
        return radius;
    }

    public void setRadius(Point radius) {
        this.radius = radius;
    }

        public double dlinaOkruzh() {
        double res = this.getCenter().distancePoint(this.getCenter(), this.getRadius()) * Math.PI * 2;
        return res;
    }

    @Override
    public Double getSquare() {
        double sq = this.getCenter().distancePoint(this.getCenter(), this.getRadius())*this.getCenter().distancePoint(this.getCenter(), this.getRadius())* Math.PI;
        return sq;
    }
}
