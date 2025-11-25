public class Main {
    public static void main(String[] args) {

        // Create school
        School school = new School("ABC Public School");

        // Create teachers
        Teacher t1 = new Teacher(1, "Mr. Sharma", "Math");
        Teacher t2 = new Teacher(2, "Mrs. Iyer", "Science");

        school.addTeacher(t1);
        school.addTeacher(t2);

        // Create students
        Student s1 = new Student(101, "Rahul", 14, "8th");
        Student s2 = new Student(102, "Priya", 13, "7th");
        Student s3 = new Student(103, "Arjun", 14, "8th");

        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);

        // Create classrooms
        Classroom class8A = new Classroom("8A", t1);
        class8A.addStudent(s1);
        class8A.addStudent(s3);

        Classroom class7A = new Classroom("7A", t2);
        class7A.addStudent(s2);

        school.addClass(class8A);
        school.addClass(class7A);

        // Display everything
        school.showAllTeachers();
        System.out.println();
        school.showAllStudents();
        System.out.println();
        school.showAllClasses();
        System.out.println();

        class8A.showStudents();
        class7A.showStudents();
    }
}
