import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String className;
    private Teacher classTeacher;
    private List<Student> students;

    public Classroom(String className, Teacher classTeacher) {
        this.className = className;
        this.classTeacher = classTeacher;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void removeStudent(int id) {
        students.removeIf(s -> s.getId() == id);
    }

    public void showStudents() {
        System.out.println("Students in " + className + ":");
        for (Student s : students) {
            System.out.println("  " + s);
        }
    }

    @Override
    public String toString() {
        return className + " (Teacher: " + classTeacher.getName() + ")";
    }
}
