//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package Sem3HW3;
import java.util.ArrayList;
import java.util.Collections;

public class Sem2HW3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(16);
        list.add(7);
        list.add(14);
        list.add(20);
        list.add(11);
        list.add(21);

        System.out.println("Список: " + list);

        int min = Collections.min(list);
        int max = Collections.max(list);
        double average = list.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average);
    }
}
