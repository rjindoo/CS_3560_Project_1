import java.util.UUID;

public class Student {

    private String studentID;
    private char studentAnswer;

    public Student(){
        this.studentID = UUID.randomUUID().toString();
        this.studentAnswer = 'A';
    }

    public char getStudentAnswer(){
        return studentAnswer;
    }

    public String getStudentID(){
        return studentID;
    }
}
