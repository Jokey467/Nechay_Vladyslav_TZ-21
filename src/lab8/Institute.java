package lab8;

import lab7.Faculty;
import lab7.Students;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Institute {

    private final Set<Faculty> faculties;
    private final String name;

    public Institute(String name, Set<Faculty> faculties) {
        this.faculties = faculties;
        this.name = name;
    }

    public int getStudentsCount() {
        Set<Students> list = new HashSet<>();
        for (lab7.Faculty faculty : faculties) {
            list.addAll(faculty.getStudents());
        }
        int count = list.size();
        list.clear();
        return count;
    }

    public lab7.Faculty getTheFacultyWithTheMostStudents() {
        int maxStudents = 0;
        lab7.Faculty faculty = null;
        for (lab7.Faculty faculty1 : faculties) {
            int students = faculty1.getStudents().size();
            if (students > maxStudents) {
                maxStudents = students;
                faculty = faculty1;
            }
        }
        return faculty;
    }

    public List<Students> getExcellentStudents() {
        List<Students> excellentStudents = new ArrayList<>();
        for (Faculty faculty : faculties) {
            for (Students students : faculty.getStudents()) {
                int point = students.getPoint();
                if (point >= 95) {
                    excellentStudents.add(students);
                }
            }
        }
        return excellentStudents;
    }
}
