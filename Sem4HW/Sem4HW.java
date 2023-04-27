//Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.
//Если введено exit, завершаем программу

package Sem4HW;
import java.util.LinkedList;
import java.util.Scanner;

public class Sem4HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        while (true) {
            System.out.println("Введите строку или print/revert/exit для выполнения команд):");
            String input = scanner.nextLine();

            if (input.equals("print")) {
                System.out.println("Строки в обратном порядке:");
                while (!list.isEmpty()) {
                    System.out.println(list.removeLast());
                }
            } else if (input.equals("revert")) {
                if (!list.isEmpty()) {
                    list.removeLast();
                    System.out.println("Последняя введенная строка удалена из памяти.");
                } else {
                    System.out.println("Ошибка! Нет сохраненных строк для удаления.");
                }
            } else if (input.equals("exit")) {
              System.out.println("Программа завершилась.");
              System.exit(0);
            } else {
                list.addLast(input);
            }
        }
    }
}
