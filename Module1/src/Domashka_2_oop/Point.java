package Domashka_2_oop;

public class Point {
    /**
     * Создать класс Point, описывающий точку в двумерных координатах.
     * Полями этого класса должны быть координаты x и y.
     * Класс должен иметь один конструктор, принимающий координаты x и y.
     * Сделайте информацию о координатах скрытой, а получить её можно
     * только с помощью методов доступа (get/set).
     * <p>
     * // методы доступа пока не проходили.
     * <p>
     * Создать метод distance,
     * принимающий объект Point и определяющий расстояние до неё.
     */
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point a, int xxx, int yyy) {
        return Math.sqrt((xxx - a.x) * (xxx - a.x) + (yyy - a.y) * (yyy - a.y));
    }

    public double distancePoint(Point a, Point b) {
        return this.distance(a, b.getX(), b.getY());
    }

    public Point translate(int shiftX, int shiftY) {
        return new Point(this.getX()+shiftX, this.getY()+shiftY);
    }

    public Point scale (int zoom) {
        return new Point (Math.round(this.getX()/zoom), Math.round(this.getY()/zoom));
    }
}

interface findSquare<T extends Number> {
    T getSquare();
}
