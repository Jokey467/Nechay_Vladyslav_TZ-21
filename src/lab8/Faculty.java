package lab8;

import lab7.Students;

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
