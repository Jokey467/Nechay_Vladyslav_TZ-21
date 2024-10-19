public class Lab1 {
    public static void main(String[] args) {
        double a = 0.58;
        double b = 0.34;
        double c = 1.25;
        double d = -1.89;
        double y = 2 * (Math.sin(a) / Math.acos(-2 * b)) - Math.sqrt(Math.log(c * Math.abs(2 * d)));
        System.out.println("y: " + y);
    }
}

//Math.sin(a) — функція для обчислення синуса.
//Math.acos(-2 * b) — функція для обчислення арккосинуса.
//Math.abs(2 * d) — модуль числа.
//Math.log(x) — функція для обчислення натурального логарифма.
//Math.sqrt(x) — квадратний корінь.