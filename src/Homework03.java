import java.util.Scanner;
public class Homework03 {
    public static void main(String[] args) {
        //#1
        int max = 10;
        int min = 500;
        int rand;
        for (int i = 0; i < 10; i++) {
            rand = (int) (Math.random() * ((max - min) + 1) + min);
            if ((rand > 25) && (rand < 200))
                System.out.println("Число " + rand + " содержится в интервале (25;200)");
            else
                System.out.println("Число " + rand + " не содержится в интервале (25;200)");
        }
        System.out.println();
        //#2
        /*int currentScoreValue = (int) (Math.random() * 101);
        System.out.println(currentScoreValue);
        if (currentScoreValue < 70) 
            currentScoreValue = 1;
        else if (currentScoreValue < 80) 
            currentScoreValue = 2;
        else if (currentScoreValue < 90)
            currentScoreValue = 3;
        else  currentScoreValue = 4;

        switch (currentScoreValue) {
            case 1 -> System.out.println("Пользователь не занял никакого места");
            case 2 -> System.out.println("Пользователь занял третье место");
            case 3 -> System.out.println("Пользователь занял второе место");
            case 4 -> System.out.println("Пользователь занял первое место");
        }
        При решении задачи задумался о switch case и случайно добавил и его
        без вариант ниже
        */
        int currentScoreValue = (int) (Math.random() * 101);
        System.out.println(currentScoreValue +" - колличество очков, набронное пользователем");
        if (currentScoreValue < 70)
            System.out.println("Пользователь не занял никакого места");
        else if (currentScoreValue < 80)
            System.out.println("Пользователь занял третье место");
        else if (currentScoreValue < 90)
            System.out.println("Пользователь занял второе место");
        else  System.out.println("Пользователь занял первое место");

        System.out.println();

        //#3 немного усовершенствовал, добавил случай, когда точка лежит на оси
        int x = (int) (Math.random() * 21 - 10);
        int y= (int) (Math.random() * 21 - 10);
        System.out.println("x = "+ x + " y = " + y);
        if (x > 0 && y > 0)
            System.out.println("Точка лежит четверти I");
        else if (x < 0 && y > 0)
            System.out.println("Точка лежит четверти II");
        else if (x < 0 && y < 0)
            System.out.println("Точка лежит четверти III");
        else if (x > 0 && y < 0)
            System.out.println("Точка лежит четверти IV");
        else System.out.println("Точка лежит на оси");

        System.out.println();

        //#4
        System.out.println("Введите номер месяца");
        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();
        System.out.println("Год является високосным?");
        boolean isLeap = scanner.nextBoolean();
        switch (monthNumber) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("В месяце 31 день");
            case 4, 6, 9, 11 -> System.out.println("В месяце 30 дней ");
            case 2 -> {
                if (isLeap) System.out.println("В месяце 29 дней ");
                else System.out.println("В месяце 28 дней ");
            }
        }
        System.out.println();

        //#5
        int couponNumber = 3333;
        double resultSum = 1000;
        switch (couponNumber){
            case 1111 -> System.out.println("Сумма со скидкой 10%: " + resultSum * 0.9);
            case 3333 -> System.out.println("Сумма со скидкой 20%: " + resultSum * 0.8);
            case 5555 -> System.out.println("Сумма со скидкой 30%: " + resultSum * 0.7);
            default -> System.out.println("скидка не предусмотрена. Сумма : " + resultSum);
        }
    }
}
