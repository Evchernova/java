//Реализовать простой калькулятор

package HW3;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        int result = 0;
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = iScanner.nextInt();
        System.out.print("Введите действие (+, -, *, /): ");
        char znak = iScanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        int num2 = iScanner.nextInt();
        switch(znak) {
           case '+': result = num1 + num2;
              break;
           case '-': result = num1 - num2;
              break;
           case '*': result = num1 * num2;
              break;
           case '/': result = num1 / num2;
              break;
           default:  System.out.printf("Ошибка, такого действия нет");
              return;
        }
        //System.out.println("Результат: ");
        System.out.printf("Результат: " + num1 + " " + znak + " " + num2 + " = " + result + "     ");
    }
}
