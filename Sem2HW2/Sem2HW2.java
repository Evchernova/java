//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package Sem2HW2;
import java.util.logging.*;
import java.io.IOException;

public class Sem2HW2 {
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j + 1] < arr[j]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
    }
    public static void main(String[] args) {
        
        Logger logger = Logger.getLogger(Sem2HW2.class.getName());
        try {
			FileHandler fl = new FileHandler("/Users/evg/Desktop/Java/Sem2HW2/MyLog.log");
			logger.addHandler(fl);
			
		} catch (SecurityException e) {
			logger.log(Level.SEVERE,
					"Не удалось создать файл лога из-за политики безопасности.", 
					e);
		} catch (IOException e) {
			logger.log(Level.SEVERE,
					"Не удалось создать файл лога из-за ошибки ввода-вывода.",
					e);
		}
	
        int[] arr = {16, 7, 14, 20, 11, 21};
        bubbleSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            logger.log(Level.INFO, "Результат " + arr[i]) ;
        }
    }
}
