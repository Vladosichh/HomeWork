import java.util.Scanner;
public class Homework04 {
    public static void main(String[] args) {
        for (int i = 0, elem = 2; i < 10; i++, elem += 2)
            System.out.print(elem + " ");
        System.out.println();

        //#2
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num != 0) {
            sum = sum + (num % 10);
            num /= 10;
        }
        System.out.println("Сумма цифр введенного числа = " + sum);

        //#3
        int rand = (int) (Math.random() * (9) + 1);
        Scanner scanner1 = new Scanner(System.in);
        int input ;
        //System.out.println(rand);
        do {
            System.out.println("Введите число лт 1 до 9");
            input = scanner1.nextInt();
            if (input == 0) {
                System.out.println("Выход из программы");
                break;
            }
            if (input > rand) System.out.println("загаданное число меньше");
            else if (input < rand) System.out.println("загаданное число больше");
            else System.out.println("Вы угадали");
        } while (input != rand);
        System.out.println(rand);

        //#4
        int min = 1, max = 100, answer;
        System.out.println("загадайте число в диапазоне  от " + min + " до " + max);
        do {
            int mid = (min + max) / 2;
            System.out.println("Ваше число " + mid + "?");
            System.out.println("Если это ваше число, нажмите 1. Если нет, нажмите 0");
            answer = scanner.nextInt();
            if (answer == 1) break;
            {
            System.out.println("Ваше число больше?");
            System.out.println("Если Ваше число больше, нажмите 1. Если меньше, нажмите 0");
            answer = scanner.nextInt();
            if (answer == 1) min = mid +1;
            else max = mid - 1;
            }
        }while (true);
        System.out.println("число угадано");
    }
}

