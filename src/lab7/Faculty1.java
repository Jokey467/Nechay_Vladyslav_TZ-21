package lab7;

import java.util.List;

public class Faculty1 {

    private final List<Students1> students;
    private final String name;

    public Faculty1(String name, List<Students1> students) {
        this.students = students;
        this.name = name;
    }


    public List<Students1> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
}
