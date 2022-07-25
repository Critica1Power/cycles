public class Main {
    public static void main(String[] args) {task1(); task2();}

    public static void task1() {
        // Задание 1


        for ( int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        int b = 10;
        while (b > 0) {
            System.out.print(b + " ");
            b--;
        }
    }

    public static void task2() {
        //Задание 2

        for (int firstFriday = 1; firstFriday <= 31; firstFriday = firstFriday + 7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
        }

    }



}