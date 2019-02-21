package DomashkaGenerics;

public class ClassPairZ1 {
    public static void main(String[] args) {

        Pair <Integer> b = new Pair<>();
        b.setItem1(1);
        b.setItem2(3);

        System.out.println("элемент 1 ="+b.getItem1()+"           элемент 2 = "+b.getItem2());
        System.out.println(b.min());
    }


}


