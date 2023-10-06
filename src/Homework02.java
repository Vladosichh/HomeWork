public class Homework02 {
    public static void main(String[] args) {
        //#1
        int a, b;
        a = 100;
        b = 25;
        System.out.println("Осталось отправить " + (a - b));

        //#2
        int time = 1;
        int distance = 50;
        System.out.println(( (double)distance * 1000)/ (time*360));

        //#3
        int c = 78;
        System.out.println(c/10 + c%10);

        //#4
        int first = 12;
        int second = 25;
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.println(first+" "+ second);


    }
}
