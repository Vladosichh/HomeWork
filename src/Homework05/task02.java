package Homework05;
import java.util.Arrays;
import java.util.Scanner;
public class task02 {

    public static void main(String[] args) {
        int a=1,i=0,j=0;
        int[] array01 = new int[4];
        int[] array02 = new int[4];
        do{
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            if (a > 0) {
                array02[i]=a;
                i++;
            } else {
                array01[j] = a;
                j++;
            }
            if (((array02[4])!= 0)&&(array01[4])!=0) break;
        }while (a!=0 );
        System.out.println(Arrays.toString(array01));
        System.out.println(Arrays.toString(array02));
        }
    }

