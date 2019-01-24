package Domashka3;

public class D3Zadacha1 {
    public static void main(String[] args) {
        String[] isxod = {"первый ", "второй ", "третий ", "четвертый "};
        System.out.println("введен следующий массив");
        for (int i = 0; i < isxod.length; i++) {
            System.out.print(isxod[i]);
        }
        sdvig(isxod);
        System.out.println("получен следующий массив");
        for (int i = 0; i < isxod.length; i++) {
            System.out.print(isxod[i]);
        }
        sdvig(isxod);
    }

    /**
     * Напишите программу, которая циклически сдвигает элементы массива
     * вправо на одну позицию, и печатает результат. Цикличность означает,
     * что последний элемент массива становится самым первым его элементом.
     */
    public static void sdvig(String[] argument) {
        String tmp = argument[argument.length - 1];
        for (int i = argument.length - 1; i > 0; i--) {
            argument[i] = argument[i - 1];
        }
        argument[0] = tmp;
    }
}
