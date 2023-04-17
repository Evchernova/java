////Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package HW;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = iScanner.nextInt();
        long sumN = 0;
        long factN = 1;
        for (int i = 1; i <= n; i++) {
            sumN = sumN + i;
        }
        System.out.println("Сумма первых n натуральных чисел: " + sumN);
        
        for (int i = 1; i <= n; i++)
        factN *= i;
        System.out.println("Факториал введенного числа n: " + factN);
        if (n == 0 || n == 1)
        System.out.println("Факториал введенного числа n: " + factN);
        if(n < 0)
        System.out.println("Вы ввели отрицательный факториал!");
    }
}
