import java.util.ArrayList;

public class Course {
    private final String courseName;
    private final int year;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName, int year){
        this.courseName = courseName;
        this.year = year;
        this.enrolledStudents = new ArrayList<>();
    }

    public void addStudent(Student student){
        enrolledStudents.add(student);
    }

    public void removeStudentByID(String studentID){
        enrolledStudents.removeIf(student -> student.getStudentID().equals(studentID));
    }

    public float getAverageStudentGPA(){
        float sum = 0;
        for (Student student : enrolledStudents){
            sum += student.getGPA();
        }
        return sum/enrolledStudents.size();
    }

    public void displayStudents(DisplayStrategy strategy){
        strategy.display(enrolledStudents);
    }

}
