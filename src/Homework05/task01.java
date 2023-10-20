package Homework05;
import java.util.Arrays;

public class task01 {
    public static void main(String[] args) {
        int len = 15, rand;
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            do {
            rand = (int) (Math.random() * (90) + 10);
            } while ((rand % 2)  != 0 );
            array[i] = rand;
        }
        System.out.println(Arrays.toString(array));
    }
}
