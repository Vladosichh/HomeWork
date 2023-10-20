package Homework05;
import java.util.Arrays;
import java.util.Scanner;
public class task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        double[] Array = new double[len];
        for (int i = 0; i <Array.length; i++) {
            Array[i] = (int) (Math.random() * (201) - 100);
        }
        double min = Array[0];
        double max = Array[0];
        double avg = 0;
        for (int i = 0; i < Array.length; i++) {
            if(Array[i] > max)
                max = Array[i];
            if (Array[i] < min)
                min = Array[i];
            avg += Array[i]/Array.length;

        }
        System.out.println(Arrays.toString(Array));
        System.out.println(min);
        System.out.println(max);
        System.out.println(avg);
    }
}
