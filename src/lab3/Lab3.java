package lab3;

public class Lab3 {

    private static void task1() {
        int k = 30;
        double m = 1.5;
        double sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += Math.sqrt(m / i) * Math.sin(m * i);
        }
        System.out.println("Сума ряду: " + sum);
    }

    private static void task2() {
        int t = 5;
        int l = 4;
        double sum = 0;
        for (int j = 1; j < t; j++) {
            if (j % 2 != 0) {
                sum += Math.sqrt(t * l);
            } else sum += l / Math.sqrt(t);
        }
        System.out.println("Сума: " + sum);
    }

    private static void task3() {
        double epsilon = 0.00001;
        double sum = 0;
        int i = 1;
        while (true) {
            double term = 1.0 / (i * (i + 1));
            if (term < epsilon) {
                break;
            }
            sum += term;
            i++;
        }
        System.out.println("Сума серії з точністю epsilon: " + sum);
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

}

