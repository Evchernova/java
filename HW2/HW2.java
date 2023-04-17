//Вывести все простые числа от 1 до 1000

package HW2;

public class HW2 {
    public static void main(String[] args) {
        int n = 1000;
        for (int i = 2; i < n; i++) {
            boolean a = true;
            int q = (int) Math.sqrt(i);
            for (int j = 2; j <= q; j++) {
                if ((i % j) == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.print(i + ", ");
            }
        }
    }
}
