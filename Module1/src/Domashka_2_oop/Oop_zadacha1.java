package Domashka_2_oop;

public class Oop_zadacha1 {
    public static void main(String[] args) {
/*        System.out.println("задача 1 с классом Point");
        Point a = new Point(5, 3);
        System.out.println("расстояние " + a.distance(a, 10, 6));

        Point p = new Point(3, 4).translate(1, 3).scale(2);
        System.out.println("точка имеет координаты X=" + p.getX() + " и Y=" + p.getY());
        System.out.println("проверка");
        Point t = new Point(3, 4).translate(1, 3);
        System.out.println("проверочная точка имеет координаты X=" + p.getX() + " и Y=" + p.getY());*/

        System.out.println("задача 2 с классом Rectangle и Circle");
        Point a1 = new Point(3, 4);
        Point a2 = new Point(7, 8);
        Rectangle b = new Rectangle(a1, a2);
        System.out.println(" диагональ прямоугольника =" + b.diagonal());

        Point b1 = new Point(0, 0);
        Point b2 = new Point(7, 8);
        Circle c = new Circle (b1, b2);
        System.out.println(" длина окружности ="+c.dlinaOkruzh());

        System.out.println("длина сторон прямоугольника а="+b.getSideA()+" и b="+b.getSideB()+" площадь прямоугольника ="+b.getSquare());
        System.out.println("площадь круга ="+c.getSquare());

        Point c1 = new Point (0,0);
        Point c2 = new Point (0,5);
        Point c3 = new Point (10,5);
        Triangle d = new Triangle(c1,c2,c3);
        System.out.println("площадь треугольника ="+d.getSquare()+" и его периметр ="+d.getPerimeter());

        Figure e = new Figure.CircleFigure(new Point (1,1), c);
        System.out.println("создана фигура Круг с площадью ="+((Figure.CircleFigure) e).getSquare()+" и периметром ="+((Figure.CircleFigure) e).getPerimeter());
        Figure f = new Figure.TriangleFigure(new Point (1,1), d);
        System.out.println("создана фигура Треугольник с площадью ="+((Figure.TriangleFigure) f).getSquare()+" и периметром ="+((Figure.TriangleFigure) f).getPerimeter());
        Figure g = new Figure.RectangleFigure(new Point (1,1), b);
        System.out.println("создана фигура Прямоугольник с площадью ="+((Figure.RectangleFigure) g).getSquare()+" и периметром ="+((Figure.RectangleFigure) g).getPerimeter());

        System.out.println("высота Круга = "+((Figure.CircleFigure) e).getHeight());
        System.out.println("высота Треугольника = "+((Figure.TriangleFigure) f).getHeight());
        System.out.println("высота Прямоугольника = "+((Figure.RectangleFigure) g).getHeight());

        Point h1 = new Point (0,0);
        Point h2 = new Point (10,5);
        Point h3 = new Point (0,5);
        Triangle j = new Triangle(h1,h2,h3);
        Figure w1 = new Figure.TriangleFigure(new Point (0,0), d);
        Figure w2 = new Figure.TriangleFigure(new Point (1,1), j);

        System.out.println("площадь треугольника # 2="+d.getSquare()+" и его периметр ="+d.getPerimeter());

        System.out.println(" площади треугольников № 1 и № 2 совпадают? ="+w1.SquareEquals(w1, w2));
        System.out.println("Фигура w1 - треугольник? ="+w1.isTriangle());
        System.out.println("Фигура w1 - прямоугольник? ="+w1.isRectangle());


        System.out.println(c.toString()); // оверрайд метода ToString выводит свое сообщение
        System.out.println(a1.toString());
        System.out.println(d.toString());
        System.out.println(w1.toString());
        System.out.println(j.toString());

    }
}
