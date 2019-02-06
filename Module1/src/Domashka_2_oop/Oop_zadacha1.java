package Domashka_2_oop;

public class Oop_zadacha1 {
    public static void main(String[] args) {
        System.out.println("задача 1 с классом Point");
        Point a = new Point(5, 3);
        System.out.println("расстояние " + a.distance(a, 10, 6));

        Point p = new Point(3, 4).translate(1, 3).scale(2);
        System.out.println("точка имеет координаты X=" + p.getX() + " и Y=" + p.getY());
        System.out.println("проверка");
        Point t = new Point(3, 4).translate(1, 3);
        System.out.println("проверочная точка имеет координаты X=" + p.getX() + " и Y=" + p.getY());

        System.out.println("задача 2 с классом Rectangle и Circle");
        Point a1 = new Point(3, 4);
        Point a2 = new Point(7, 8);
        Rectangle b = new Rectangle(a1, a2);
        System.out.println(" диагональ прямоугольника =" + b.diagonal());

        Point b1 = new Point(0, 0);
        Point b2 = new Point(7, 8);
        Circle c = new Circle (b1, b2);
        System.out.println(" длина окружности ="+c.dlinaOkruzh());

        System.out.println("площадь прямоугольника ="+b.getSquare());
        System.out.println("площадь круга ="+c.getSquare());

    }
}
