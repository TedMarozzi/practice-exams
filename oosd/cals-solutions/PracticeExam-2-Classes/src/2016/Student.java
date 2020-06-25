public final class Student extends Person{
    private final String studentID;
    private float GPA;
    public Student(String firstName, String lastName){
        super(firstName, lastName);
        this.studentID = createNewID();
    }

    private String createNewID(){
        return "";
    }

    public float getGPA() {
        return GPA;
    }

    public String getStudentID() {
        return studentID;
    }
}
