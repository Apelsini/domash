package Domashka3;

import java.util.Scanner;

public class D3Zadacha2 {
    // Написать программу, принимающую массив целых чисел,
    // в котором м.б. повторения,
    //  и возвращающую новый массив без повторяющихся числел,
    //  и печатающую результат. В результирующем массиве не
    //  должно быть дубликатов.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число элементов в массиве");
        int a = sc.nextInt();
        int[] mas = new int[a];
        for (int b = 0; b < mas.length; b++) {
            System.out.println("введите " + b + " элемент массива:");
            mas[b] = sc.nextInt();
        }
        int[] dup = markduplicates(mas);

        System.out.println("получен следующий массив, где дубликаты помечены 1");
        for (int i = 0; i < dup.length; i++) {
            System.out.print(dup[i]);
        }
        System.out.println(" ");
        int[] reslt = new int[mas.length-numdupl(dup)];
        int count = 0;
        for (int g=0; g<mas.length; g++){
            if (dup[g]==0) {
                reslt[count]=mas[g];
                count++;
            }
        }

        System.out.println("получен следующий результирующий массив");
        for (int i = 0; i < reslt.length; i++) {
            System.out.print(reslt[i]);
        }

    }

    public static int[] markduplicates(int[] m) {
        int[] dupl = new int[m.length];
        for (int c = 0; c < dupl.length; c++) {
            //обнуляем массив, где единичками будем помечать дубликаты
            dupl[c] = 0;
        }
        for (int i = 0; i < m.length; i++) {
            int tmp = m[i];
            for (int j = i; j < m.length; j++) {
                if (i != j) {
                    if (m[j] == tmp) {
                        dupl[j] = 1;
                    }
                }
            }
        }
        return dupl;

    }
     public static int numdupl (int[] ms) {
        int res = 0;
        for (int i=0; i<ms.length; i++){
            res=res+ms[i];
        }
        return res;
     }


}
