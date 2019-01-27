package Domashka_2_oop;

public class Point {
    /** Создать класс Point, описывающий точку в двумерных координатах.
     Полями этого класса должны быть координаты x и y.
     Класс должен иметь один конструктор, принимающий координаты x и y.
     Сделайте информацию о координатах скрытой, а получить её можно
     только с помощью методов доступа (get/set).

     // методы доступа пока не проходили.

     Создать метод distance,
     принимающий объект Point и определяющий расстояние до неё.
     */
   static int x;
    static int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance (Point a, int xxx, int yyy) {
        return Math.sqrt((xxx-a.x)*(xxx-a.x)+(yyy-a.y)*(yyy-a.y));
    }
}
