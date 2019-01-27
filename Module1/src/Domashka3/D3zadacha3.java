package Domashka3;

import java.util.Arrays;

public class D3zadacha3 {
    /*
    Заданы 2 массива целых чисел произвольной длины.
    Написать программу, создающую третий массив, представляющий собой слияние
    2-х заданных. Пример:
1-й массив: {1, 2, 3, 4, 5}
2-й массив: {5, 6, 7}
Результат: {1, 5, 2, 6, 3, 7, 4, 5}
Дополнительно: результирующий массив должен быть отсортированной версией.
     */

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8, 9, 10, 11};

        printmassiv(a, "массив а:");
        printmassiv(b, "массив b:");
        int[] c = new int[a.length + b.length];

        int ind = 0;
        for (int i=0; i<Math.max(a.length, b.length); i++){
         if (i<a.length) {
         c[ind]=a[i];
         ind++;
         }
         if (i<b.length) {
             c[ind]=b[i];
             ind++;
         }
        }

        printmassiv(c, "результирующий массив:");

        Arrays.sort(c);

        printmassiv(c, "отсортированный результирующий массив:");
    }


    public static void printmassiv(int[] ma, String messedg) {
        System.out.println(messedg);
        for (int i = 0; i < ma.length; i++) {
            System.out.print(ma[i] + " ");
        }
        System.out.println("");
    }


}
