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
        int m
    }
}
