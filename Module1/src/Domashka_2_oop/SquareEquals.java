package Domashka_2_oop;

abstract class SquareEquals {

    public SquareEquals() {
    }

    public boolean SquareEquals(Figure a, Figure b) {

        return (squareOfFigure(a)==squareOfFigure(b));
    }

    public double squareOfFigure (Figure a) {
        double sqa;
        if (a instanceof Figure.RectangleFigure) {
            sqa = ((Figure.RectangleFigure) a).getSquare();
        }
        if (a instanceof Figure.CircleFigure) {
            sqa = ((Figure.CircleFigure) a).getSquare();
        }
        if (a instanceof Figure.TriangleFigure) {
            sqa = ((Figure.TriangleFigure) a).getSquare();
        } else {
            sqa = -1;
        }
        return sqa;
    }



}
