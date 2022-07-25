public class Main {
    public static void main(String[] args) {task1(); task2(); task3();}

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
        System.out.println();
    }

    public static void task2() {
        //Задание 2

        for (int firstFriday = 1; firstFriday <= 31; firstFriday = firstFriday + 7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
        }

    }

    public static void task3() {
        //Задание 3

        int firstYear = 0;
        int beforeYear = 1822;
        int futureYear = 2122;
        for (; firstYear <= futureYear; firstYear = firstYear + 79) {
            if (firstYear > beforeYear) {
                System.out.println(firstYear);
            }
        }
    }



}