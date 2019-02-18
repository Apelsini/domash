package Domashka_2_oop;

abstract class Figure extends SquareEquals {
    private Figure() {

    }

    public static final class CircleFigure extends Figure implements findHeight<Double> {
        private Point anchor;
        private Circle circle;
        private Double square;
        private Double perimeter;

        public CircleFigure(Point anchor, Circle circle) {
            this.anchor = anchor;
            this.circle = circle;
            this.setPerimeter(this.getCircle().dlinaOkruzh());
            this.setSquare(this.getCircle().getSquare());
        }

        public Point getAnchor() {
            return anchor;
        }

        public Circle getCircle() {
            return circle;
        }

        public Double getSquare() {
            return square;
        }

        public Double getPerimeter() {
            return perimeter;
        }

        public void setAnchor(Point anchor) {
            this.anchor = anchor;
        }

        public void setCircle(Circle circle) {
            this.circle = circle;
        }

        public void setSquare(Double square) {
            this.square = square;
        }

        public void setPerimeter(Double perimeter) {
            this.perimeter = perimeter;
        }

        @Override
        public Double getHeight() {
            return 2 * this.getCircle().getRadius().distancePoint(this.getCircle().getCenter(), this.getCircle().getRadius());
        }
    }

    public static final class RectangleFigure extends Figure implements findHeight<Double> {
        private Point anchor;
        private Rectangle rectangle;
        private double square;
        private double perimeter;

        public RectangleFigure(Point anchor, Rectangle rectangle) {
            super();
            this.anchor = anchor;
            this.rectangle = rectangle;
            this.setPerimeter(this.getRectangle().getPerimeter().doubleValue());
            this.setSquare(this.getRectangle().getSquare().doubleValue());
        }

        public Point getAnchor() {
            return anchor;
        }

        public void setAnchor(Point anchor) {
            this.anchor = anchor;
        }

        public Rectangle getRectangle() {
            return rectangle;
        }

        public void setRectangle(Rectangle rectangle) {
            this.rectangle = rectangle;
        }

        public Double getSquare() {
            return square;
        }

        public void setSquare(Double square) {
            this.square = square;
        }

        public Double getPerimeter() {
            return perimeter;
        }

        public void setPerimeter(Double perimeter) {
            this.perimeter = perimeter;
        }

        @Override
        public Double getHeight() {
            return Double.valueOf(Math.max(this.getRectangle().getSideA(), this.getRectangle().getSideB()));
        }
    }

    public static final class TriangleFigure extends Figure implements findHeight<Double> {
        private Point anchor;
        private Triangle triangle;
        private double square;
        private double perimeter;

        public TriangleFigure(Point anchor, Triangle triangle) {
            super();
            this.anchor = anchor;
            this.triangle = triangle;
            this.setPerimeter(this.getTriangle().getPerimeter());
            this.setSquare(this.getTriangle().getSquare());
        }

        public TriangleFigure(Point point, Point a1, Point b1, Point c1) {
            super();
        }

        public Point getAnchor() {
            return anchor;
        }

        public void setAnchor(Point anchor) {
            this.anchor = anchor;
        }

        public Triangle getTriangle() {
            return triangle;
        }

        public void setTriangle(Triangle triangle) {
            this.triangle = triangle;
        }

        public double getSquare() {
            return square;
        }

        public void setSquare(double square) {
            this.square = square;
        }

        public double getPerimeter() {
            return perimeter;
        }

        public void setPerimeter(double perimeter) {
            this.perimeter = perimeter;
        }

        @Override
        public Double getHeight() {
            double sideA = this.getTriangle().getSideA();
            double sideB = this.getTriangle().getSideВ();
            double sideC = this.getTriangle().getSideС();
            //System.out.println("сторона 1="+sideA+" сторона 2="+sideB+" сторона 3="+sideC);
            double p = 0.5f * (sideA + sideB + sideC);
            double q = p * (p - sideA) * (p - sideB) * (p - sideC);
            double ha = 2 * Math.sqrt(q) / sideA;
            double hb = 2 * Math.sqrt(q) / sideB;
            double hc = 2 * Math.sqrt(q) / sideC;
            return Math.max(Math.max(ha, hb), hc);
        }
    }

}
