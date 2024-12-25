package lab7;

import java.util.ArrayList;
import java.util.List;

public class Institute1 {

    private final List<Faculty1> faculties;
    private final String name;

    public Institute1(String name, List<Faculty1> faculties) {
        this.faculties = faculties;
        this.name = name;
    }

    public int getStudentsCount() {
        int total = 0;
        for (Faculty1 faculty : faculties) {
            total += faculty.getStudents().size();
        }
        return total;
    }

    public Faculty1 getTheFacultyWithTheMostStudents() {
        int maxStudents = 0;
        Faculty1 faculty = null;
        for (Faculty1 faculty1 : faculties) {
            int students = faculty1.getStudents().size();
            if (students > maxStudents) {
                maxStudents = students;
                faculty = faculty1;
            }
        }
        return faculty;
    }

    public List<Students1> getExcellentStudents() {
        List<Students1> excellentStudents = new ArrayList<>();
        for (Faculty1 faculty : faculties) {
            for (Students1 student : faculty.getStudents()) {
                int point = student.getPoint();
                if (point >= 95) {
                    excellentStudents.add(student);
                }
            }
        }
        return excellentStudents;
    }

    public static void main(String[] args) {
        Students1 student1 = new Students1("Vladik Nechay", 5345,96);
        Students1 student2 = new Students1("Igor S", 1492234, 92);
        Students1 student3 = new Students1("Nastya B", 423414, 88);
        Students1 student4 = new Students1("Diman Chotkiy", 1941, 97);
        Students1 student5 = new Students1("Lesik NeChotkiy", 192341, 20);
        Faculty1 faculty1 = new Faculty1("TZ", List.of(student1, student2, student5));
        Faculty1 faculty2 = new Faculty1("KI", List.of(student3, student4));
        Institute1 institute = new Institute1("Best Institute", List.of(faculty1, faculty2));
        System.out.println("Загальна кількість студентів: " + institute.getStudentsCount());
        Faculty1 largestFaculty = institute.getTheFacultyWithTheMostStudents();
        System.out.println("Факультет з найбільшою кількістю студентів: " + largestFaculty.getName());
        List<Students1> excellentStudents = institute.getExcellentStudents();
        System.out.println("Список відмінників:");
        for (Students1 excellent : excellentStudents) {
            System.out.println(excellent.getName() + " бал: " + excellent.getPoint());
        }
    }
}
