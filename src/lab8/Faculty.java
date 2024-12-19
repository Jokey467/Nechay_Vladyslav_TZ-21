package lab8;

import lab7.Students1;

import java.util.Set;

public class Faculty {

    private final Set<Students1> students;
    private final String name;

    public Faculty(String name, Set<Students1> students) {
        this.students = students;
        this.name = name;
    }


    public Set<Students1> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
}
