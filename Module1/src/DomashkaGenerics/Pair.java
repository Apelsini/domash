package DomashkaGenerics;

public class Pair<E> implements Comparable<E> {
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

    public E min() {
        if (this.compareTo(this.item2) >= 0) {
            return this.getItem2();
        } else {
            return this.getItem1();
        }
    }

    public E max() {
        if (this.compareTo(this.item2) < 0) {
            return this.getItem1();
        } else {
            return this.getItem2();
        }
    }

    @Override
    public int compareTo(E o) {
        if (o instanceof Integer) {

            return ((Integer) this.item1) - ((Integer) o);
        } else {
            return 0;
        }
    }
}

