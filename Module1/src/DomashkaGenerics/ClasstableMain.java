package DomashkaGenerics;

import java.util.ArrayList;
/*
*** Реализуйте обобщенный класс Table<K, V>, управляющий списочным массивом,
        состоящим из элементов типа Entry<K, V>. Предоставьте методы для получения значения,
        связанного с ключом, установки значения по заданному ключу и удаления ключа.*/

public class ClasstableMain {
    public static void main(String[] args) {
        Entry<String, Integer> a1 = new Entry ("value1", 15);
        Entry<String, Integer> a2 = new Entry("value2", 20);
        Entry<String, Integer> a3 = new Entry("value3", 30);
        Table<String, Integer> t = new Table (new ArrayList<Entry>(2));
        t.addElement(a2);
        t.addElement(a2);

        System.out.println(t.toString());
        System.out.println(t.getElement(0).getK());
        System.out.println(t.getElement(0).getV());

        System.out.println("---"+t.getByKey("value3"));

    }
}
