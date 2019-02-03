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
       Point a1 = new Point (3,4);
       Point a2 = new Point(7,8);
        Rectangle b = new Rectangle(new Point (1,1), new Point(3,4));
        b.setCorner1(a1);
        b.setCorner1(a2);
        System.out.println(" диагональ прямоугольника ="+b.diagonal());


    }
}
