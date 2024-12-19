package lab4;

import java.util.Arrays;

public class Lab4 {

    private static void task1() {
        int[] masiv = {23, 535, 21, 52, 2, 8, 60};
        int f = 1;
        for (int num : masiv) {
            if (num % 2 == 0) {
                f *= num;
            }
        }
        System.out.println("Геометричне середнє: " + Math.sqrt(f));
    }

    private static void task2() {
        int[] masiv = {1, 7, 64, 143, 78, 35, 55};
        int f = 0;
        for (int i = 0; i < masiv.length; i++) {
            int num = masiv[i];
            if (i % 2 == 0 && num > 3) {
                f += num;
            }
        }
        System.out.println("Сума: " + f);
    }

    private static void task3() {
        int[] masiv = {6, 98, 67, 3, 6, 3535, 78};
        int dilnik = Arrays.stream(masiv).min().getAsInt();
        for (int i = 0; i < masiv.length; i++) {
            masiv[i] /= dilnik;
        }
        System.out.println("Новий масив: " + Arrays.toString(masiv));
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
}
