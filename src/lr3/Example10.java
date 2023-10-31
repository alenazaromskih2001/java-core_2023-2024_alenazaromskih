package lr3;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Example10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        Integer size = id.nextInt();
        System.out.println("Размер массива равен " + size);
        Integer[] nums = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);
        }
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println("Произведена сортировка массива");

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Элемент массива [" + i + "] после сортировки =" + nums[i]);
        }
    }
}


