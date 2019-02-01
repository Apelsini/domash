package Domashka_2_oop;

public class Car {

    static int position;
    static float rasx;

    public float getRasx() {
        return rasx;
    }

    public void setRasx(float rasx) {
        Car.rasx = rasx;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public Car(int initialPosition, float rasxod) {
        this.setPosition(initialPosition);
        this.setRasx(rasxod);
    }
}
