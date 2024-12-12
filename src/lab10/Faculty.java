package lab10;

import java.util.List;

public class Faculty {

    private final List<Students> students;
    private final String name;

    public Faculty(String name, List<Students> students) {
        this.students = students;
        this.name = name;
    }


    public List<Students> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
}
