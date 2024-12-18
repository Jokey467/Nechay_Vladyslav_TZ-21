package lab12;

import lab10.Students;

import java.util.List;
import java.util.Set;

public class Faculty {

    private final Set<Students> students;
    private final String name;

    public Faculty(String name, Set<Students> students) {
        this.students = students;
        this.name = name;
    }


    public Set<Students> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
}
