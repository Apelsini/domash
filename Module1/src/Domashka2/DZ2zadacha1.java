package Domashka2;

import java.util.Scanner;

public class DZ2zadacha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число, сумму цифр которого надо посчитать:");
        int a = sc.nextInt();
        int sum = 0;
        while (a > 0) {
            System.out.println(lastnum(a));
            sum = sum + lastnum(a);
            a = a - lastnum(a);
            a = Math.round(a / 10);

        }
        System.out.println(sum);

    }

    /*
    Написать программу, вычисляющую сумму цифр
    введённого пользователем целого числа.
     */
    public static int lastnum(int arg) {

        return arg % 10;
    }

}
