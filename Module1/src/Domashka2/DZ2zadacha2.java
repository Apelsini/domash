package Domashka2;
import java.util.Scanner;
public class DZ2zadacha2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число, меньше которого надо вывести числа Фибоначчи:");
        int a = sc.nextInt();
        System.out.println("Фибоначчи через цикл while");
        fibon(a);

        System.out.println("Фибоначчи через рекурсию");
        System.out.println("1 вводное ");
        System.out.println("1 второе вводное, и поехали");
        fibonrecursion(1,1,a);
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

    public static void fibonrecursion (int f1, int f2, int max){
         int f3 =f1+f2;
        if (f3<max) {
            System.out.println(f3);
            fibonrecursion(f2,f3,max);
        }
    }

}
