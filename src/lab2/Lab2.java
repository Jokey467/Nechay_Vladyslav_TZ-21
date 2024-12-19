package lab2;

public class Lab2 {
    public static void task1() {
        // --- Вираз 6 ---
        double a1 = -1.23;
        double b1 = -0.34;
        double c1 = 0.707;
        double d1 = 2.312;

        double y1 = 3 * (Math.log10(b1 / a1) + Math.sqrt(Math.sin(c1) + Math.exp(d1)));
        System.out.println("Результат виразу 1: " + y1);

        // --- Вираз 16 ---
        double a2 = 0.58;
        double b2 = 0.34;
        double c2 = 1.25;
        double d2 = -1.89;

        double y2 = 2 * (Math.sin(a2) / Math.acos(-2 * b2) - Math.sqrt(Math.log(c2 * Math.abs(2 * d2))));
        System.out.println("Результат виразу 2: " + y2);

        // --- Вираз 26 ---
        double a3 = 1.27;
        double b3 = 10.99;
        double c3 = 4;
        double d3 = -25.32;

        double y3 = Math.sqrt(Math.tan(a3)) / (2 - Math.sinh(b3) / Math.log(Math.abs(d3 + c3)));
        System.out.println("Результат виразу 3: " + y3);
    }

    public static void main(String[] args) {
        task1();
    }
}
