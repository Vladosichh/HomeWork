package Homework05;
import java.util.Arrays;
public class task04 {
    public static void main(String[] args) {
        int[] task04 ={88,34,12,55,90,4,10,44};
        //int[] task04 ={0,1,2,3,4,5,6,7};
        //int[] task04 ={7,6,5,4,3,2,1,0};
        int wStart = 0;
        int sum = 0, target=0;
        for (int wEnd = 3; wEnd < task04.length  ; wEnd++) {
            for (int i = wStart; i <= wEnd ; i++)
                sum+= task04[i];
            if (sum > target)
                target = sum;
            sum=0;
            wStart++;
        }
        System.out.println(target);

    }
}
