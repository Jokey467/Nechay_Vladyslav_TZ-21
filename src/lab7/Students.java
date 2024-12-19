package lab7;

public class Students {

    private final String name;
    private final int number, point;

    public Students(String name, int number, int point) {
        this.number = number;
        this.point = point;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getPoint() {
        return point;
    }
}
