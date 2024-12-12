package lab1;

public class Lab1 {
    public static void task1() {
        double a = 0.58;
        double b = 0.34;
        double c = 1.25;
        double d = -1.89;
        double y = 2 * (Math.sin(a) / Math.acos(-2 * b)) - Math.sqrt(Math.log(c * Math.abs(2 * d)));
        System.out.println("y: " + y);
    }
}
