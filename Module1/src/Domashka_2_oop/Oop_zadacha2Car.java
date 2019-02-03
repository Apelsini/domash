package Domashka_2_oop;

public class Oop_zadacha2Car {
    public static void main(String[] args) {
        Car porsche = new Car("Porsche", 0, 15.7f, 65.0f);
        System.out.println("заведена машина " + porsche.getName() + " с расходом " + porsche.getRasx() + " которая стоит на позиции " + porsche.getPosition() + " и в баке у нее " + porsche.getBenzobak() + " л." + " в баке помещается до " + porsche.getBenzomax());
        porsche.fillbenzobak(65.5f);
        System.out.println("заправлена машина " + porsche.getName() + " с расходом " + porsche.getRasx() + " которая стоит на позиции " + porsche.getPosition() + " и в баке у нее " + porsche.getBenzobak() + " л." + " в баке помещается до " + porsche.getBenzomax());
        int move = 320;
        porsche.move(move);
        System.out.println("передвигаем машину на "+move+" км. Это потребует "+porsche.getRasx()*move/100+" л.");
        System.out.println("перемещена машина " + porsche.getName() + " с расходом " + porsche.getRasx() + " которая стоит на позиции " + porsche.getPosition() + " и в баке у нее " + porsche.getBenzobak() + " л." + " в баке помещается до " + porsche.getBenzomax());
        System.out.println(porsche.getName()+" еще может проехать "+porsche.distanceleft()+" км.");
    }
}
