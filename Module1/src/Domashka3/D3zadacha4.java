package Domashka3;

public class D3zadacha4 {
    /**
     * 4. Написать функцию linearize, которая принимает в качестве параметра
     * двумерный массив и возвращает одномерный массив со всеми элементами двумерного.
     */
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4},
                {5, 6, 7, 8}};
        //   System.out.println(a[0].length);
        int[] g = linearize(a);
        for (int i = 0; i < g.length; i++) {
            System.out.print(g[i] + " ");
        }
    }

    public static int[] linearize (int[][] f) {
        int[] c = new int[f.length * f[0].length];
        //   System.out.println(c.length);
        int index = 0;
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[0].length; j++) {
                c[index] = f[i][j];
                index++;
            }
        }
        return c;
    }

}
