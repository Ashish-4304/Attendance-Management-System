import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Teacher> teachers;
    private List<Student> students;
    private List<Classroom> classes;

    public School(String schoolName) {
        this.schoolName = schoolName;
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        classes = new ArrayList<>();
    }

    public void addTeacher(Teacher t) {
        teachers.add(t);
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void addClass(Classroom c) {
        classes.add(c);
    }

    public void showAllTeachers() {
        System.out.println("Teachers:");
        for (Teacher t : teachers) System.out.println("  " + t);
    }

    public void showAllStudents() {
        System.out.println("Students:");
        for (Student s : students) System.out.println("  " + s);
    }

    public void showAllClasses() {
        System.out.println("Classes:");
        for (Classroom c : classes) System.out.println("  " + c);
    }
}
