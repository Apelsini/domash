package Domashka3;
import java.util.Scanner;

public class D3zadacha2 {
    /**
     * Написать программу, принимающую массив целых чисел, в котором м.б. повторения,
     * и возвращающую новый массив без повторяющихся числел, и печатающую результат.
     * В результирующем массиве не должно быть дубликатов.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите количество целых числе в массиве");
        int a = sc.nextInt();
        int[] mas = new int[a];
        for (int k = 0; k < a; k++) {
            System.out.println("введите элемент массива " + k);
            mas[k] = sc.nextInt();
        }
        int[] md = massiv_dublikatov(mas);
        int kolvodublikatov = 0;
        for (int n=0; n < md.length; n++) {
            kolvodublikatov = kolvodublikatov + md[n];
        }
        System.out.println("в массиве найдено дубликатов:"+kolvodublikatov);
        System.out.println("массив пометок дубликатов:");

        for (int l = 0; l < md.length; l++) {
            System.out.print(md[l]+" ");
        }

        int[] newmassiv = new int[mas.length - kolvodublikatov];
        System.out.println("");
        System.out.println("в массиве удалены повторяющиеся элементы и создан массив:");
        int index = 0;
        for (int p = 0; p < mas.length; p++) {
            if (mas[p] * md[p] == 0) {
                newmassiv[index] = mas[p];
                index++;
            }


        }
        for (int q = 0; q < newmassiv.length; q++) {
            System.out.println(newmassiv[q]);
        }
    }

    public static int[] massiv_dublikatov (int[] b) {
        int[] md = new int [b.length];
        for (int i=0; i<b.length; i++) {
            md[i]=0;
        }
        int poisk;
        for (int i=0; i<b.length; i++){
            poisk = b[i];
            for (int j=0; j<b.length; j++) {
                if (j>i) {
                    if (b[j]==poisk) {
                        md[j]=1;
                    }
                }
            }
        }

        return md;
    }

}
