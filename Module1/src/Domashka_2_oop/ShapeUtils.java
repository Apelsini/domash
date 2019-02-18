package Domashka_2_oop;

abstract class ShapeUtils extends SquareEquals {

    ShapeUtils() {

    }

    boolean isRectangle() {
        return  (this instanceof Figure.RectangleFigure) ;
        }


    boolean isTriangle() {
        return  (this instanceof Figure.TriangleFigure) ;
    }

}
