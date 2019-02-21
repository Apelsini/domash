package DomashkaGenerics;

public class Pair<E> implements Minomax {
    private E item1;
    private E item2;

    public E getItem1() {
        return item1;
    }

    public void setItem1(E item1) {
        this.item1 = item1;
    }

    public E getItem2() {
        return item2;
    }

    public void setItem2(E item2) {
        this.item2 = item2;
    }

  public  E min() {
      if (this.item1 instanceof Integer) {
          return Math.min(this.getItem1(),this.getItem2());
      } return this.getItem1();
    }

  public E max() {
        if (this.item1 instanceof Integer) {
            return Math.max(this.getItem1(),this.getItem2());
        } return this.getItem2();
    }
}

interface Minomax<E> {
   E min();
   E max();

}