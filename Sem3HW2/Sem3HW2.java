//Пусть дан произвольный список целых чисел, удалить из него чётные числа

package Sem3HW2;
import java.util.ArrayList;

public class Sem3HW2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(16);
        numbers.add(7);
        numbers.add(14);
        numbers.add(20);
        numbers.add(11);
        numbers.add(21);

        System.out.println("Список: " + numbers);

        numbers.removeIf(n -> n % 2 == 0);

        System.out.println("Список без четных чисел: " + numbers);
    }
}
