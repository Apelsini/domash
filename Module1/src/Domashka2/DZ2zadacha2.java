package Domashka2;
import java.util.Scanner;
public class DZ2zadacha2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число, меньше которого надо вывести числа Фибоначчи:");
        int a = sc.nextInt();
        fibon(a);
    }
    /*
    Написать программу, вычисляющую и отображающую все числа
    Фибоначчи меньше введённого пользователем целого числа.
Решить двумя способами:
с помощью цикла
с помощью рекурсии.
     */
    public static void fibon (int b){
        int fib1=1;
        int fib2 =1;
        int fib3=1;
        System.out.println(fib1);
        while (fib3<b) {
            System.out.println(fib3);
            fib3= fib1+fib2;
            fib1=fib2;
            fib2=fib3;
        }
    }

}
