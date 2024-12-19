package lab7;

import java.util.ArrayList;
import java.util.List;

public class Institute {

    private final List<Faculty> faculties;
    private final String name;

    public Institute(String name, List<Faculty> faculties) {
        this.faculties = faculties;
        this.name = name;
    }

    public int getStudentsCount() {
        int total = 0;
        for (Faculty faculty : faculties) {
            int facStudents = faculty.getStudents().size();
            total += facStudents;
        }
        return total;
    }

    public Faculty getTheFacultyWithTheMostStudents() {
        int maxStudents = 0;
        Faculty faculty = null;
        for (Faculty faculty1 : faculties) {
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
