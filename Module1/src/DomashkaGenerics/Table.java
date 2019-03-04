package DomashkaGenerics;

import java.util.ArrayList;

/**
 * Created by user on 01.03.2019.
 */
public class Table<K, V> {
    private ArrayList<Entry<K, V>> arr = new ArrayList<Entry<K, V>>();

    public Table(ArrayList<Entry<K, V>> arr) {
        this.arr = arr;
    }

    public void addElement(Entry<K, V> entry) {
        this.arr.add(entry);
    }

    public void removeElement(Entry<K, V> entry) {
        this.arr.remove(this.arr.lastIndexOf(entry));
    }


    public V getByKey(K k) {
        for (int i=0; i<this.arr.size(); i++) {
            if (this.arr.get(i).getK() == k) {
                return this.arr.get(i).getV();
            }
        }
    }
}
