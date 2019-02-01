package Domashka_2_oop;

public class Oop_zadacha1 {
    public static void main(String[] args) {
        Point a = new Point(5, 3);
        System.out.println("расстояние " + a.distance(a, 10, 6));

        Point p = new Point(3, 4).translate(1, 3).scale(2);
        System.out.println("точка имеет координаты X=" + p.getX() + " и Y=" + p.getY());
        System.out.println("проверка");
        Point t = new Point(3, 4).translate(1, 3);
        System.out.println("проверочная точка имеет координаты X=" + p.getX() + " и Y=" + p.getY());

    }
}
