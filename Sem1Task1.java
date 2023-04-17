import java.util.Scanner;

public class Sem1Task1 {
    public static void main(String[] args) {
        /*Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s! \n", name);
        iScanner.close();*/

    /*int[] arr = new int[]{1,1,0,1,1,1,1,1,0,1,1,1};
    int count = 0;
    int max = 0;
    for (int i = 0; i< arr.length; i++){
        if (arr[i] == 1) {
            count++;
            if(count>max){
                max = count;
            }
        }
        else {
            count = 0;
        }
        System.out.println(max);
    }*/
    int[] nums = new int[]{3,2,2,3,1,2,5,3,1,3,4,6};
    int val = 3;
    int if_count = 0;
    int else_count = 0;
    int[] new_arr = new int[nums.length];
    
    //Основной код
    for (int i = 0; i < nums.length; i++){
        if(nums[i] == val){
            new_arr[nums.length - 1 - if_count] = nums[i];
            if_count++;
        }
    }
    //Вывод в консоль
    for (int i = 0; i < new_arr.length; i++){
        System.out.print(new_arr[i]);
    }
}
}