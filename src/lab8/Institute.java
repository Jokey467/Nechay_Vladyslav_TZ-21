package lab8;

import lab7.Faculty1;
import lab7.Students1;

import java.util.*;

public class Institute {

    private final Set<Faculty> faculties;
    private final String name;
    private Map<Faculty, Integer> facultyAndStudents = new HashMap<>();

    public Institute(String name, Set<Faculty> faculties) {
        this.faculties = faculties;
        this.name = name;
    }

    public int getStudentsCount() {
        Set<Students1> list = new HashSet<>();
        for (Faculty faculty : faculties) {
            list.addAll(faculty.getStudents());
        }
        int count = list.size();
        list.clear();
        return count;
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

    public List<Students1> getExcellentStudents() {
        List<Students1> excellentStudents = new ArrayList<>();
        for (Faculty faculty : faculties) {
            for (Students1 students : faculty.getStudents()) {
                int point = students.getPoint();
                if (point >= 95) {
                    excellentStudents.add(students);
                }
            }
        }
        return excellentStudents;
    }

    public void putFacultyAndStudents() {
        for (Faculty faculty : faculties) {
            facultyAndStudents.put(faculty, faculty.getStudents().size());
        }

    }

    public static void main(String[] args) {
        Students1 student1 = new Students1("Vladik Nechay", 5345,96);
        Students1 student2 = new Students1("Igor S", 1492234, 92);
        Students1 student3 = new Students1("Nastya B", 423414, 88);
        Students1 student4 = new Students1("Diman Chotkiy", 1941, 97);
        Students1 student5 = new Students1("Lesik NeChotkiy", 192341, 20);
        Faculty faculty1 = new Faculty("TZ", Set.of(student1, student2, student5));
        Faculty faculty2 = new Faculty("KI", Set.of(student3, student4));
        Institute institute = new Institute("Best Institute", Set.of(faculty1, faculty2));
        System.out.println("Загальна кількість студентів: " + institute.getStudentsCount());
        Faculty largestFaculty = institute.getTheFacultyWithTheMostStudents();
        System.out.println("Факультет з найбільшою кількістю студентів: " + largestFaculty.getName());
        List<Students1> excellentStudents = institute.getExcellentStudents();
        System.out.println("Список відмінників:");
        for (Students1 excellent : excellentStudents) {
            System.out.println(excellent.getName() + " бал " + excellent.getPoint());
        }
        institute.putFacultyAndStudents();
        for (Map.Entry<Faculty, Integer> entry : institute.facultyAndStudents.entrySet()) {
            System.out.println("Факультет " + entry.getKey().getName() + " та кількість його студентів " + entry.getValue());
        }
    }
}
