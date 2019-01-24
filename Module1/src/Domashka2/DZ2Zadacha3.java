package Domashka2;

import java.util.Scanner;

public class DZ2Zadacha3 {
    Scanner sc = new Scanner(System.in);

  //  System.out.println("введите число дней")
    int n = sc.nextInt();
    int bsum = 0;
    int dmax = 0;
    for(int i = 1;i<n; i++)

    {
        System.out.println("введите количество осадков за день " + i);
        int curr = sc.nextInt();
        System.out.println("всего за " + i + " дней:");
        bsum = bsum + curr;
        System.out.println("сумма осадков =" + bsum);
        System.out.println("среднее количество осадков =" + bsum / i);
        if (curr > dmax) {
            dmax = curr;
        }
        System.out.println("максимальное количество осадков =" + dmax);


    }
}
