package Domashka_2_oop;

public class Car {

    private int position;
    private float rasx;
    private float benzobak;
    private float benzomax;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBenzomax(float benzomax) {
        this.benzomax = benzomax;
    }

    public float getBenzomax() {
        return benzomax;
    }

    public float getBenzobak() {
        return benzobak;
    }

    public void setBenzobak(float benzobak) {
        this.benzobak = benzobak;
    }

    public float getRasx() {
        return rasx;
    }

    public void setRasx(float rasx) {
        this.rasx = rasx;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }


    public Car(String name, int initialPosition, float rasxod, float benzomax) {
        this.setName(name);
        this.setPosition(initialPosition);
        this.setRasx(rasxod);
        this.setBenzomax(benzomax);
    }

    public void fillbenzobak(float fillgas) {
        if (fillgas > 0) {
            if ((this.getBenzobak() + fillgas) > this.getBenzomax()) {
                this.setBenzobak(this.getBenzomax());
            } else {
                this.setBenzobak(this.getBenzobak() + fillgas);
            }
        } else {
            if ((this.getBenzobak() + fillgas) <0) {
                this.setBenzobak(0);
            } else {
                this.setBenzobak(this.getBenzobak() + fillgas);
            }
        }


    }

    public void move(int km) {
        float spare = km*this.getRasx()/100;
        if (spare>this.getBenzobak()) {
            km = (int) Math.floor(this.getBenzobak()/this.getRasx()*100);
        }
        this.setPosition(km);
        this.fillbenzobak(-1*spare);
    }

    public int distanceleft() {
        return (int) Math.floor(this.getBenzobak()/this.getRasx()*100);
    }
}
