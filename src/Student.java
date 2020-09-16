import java.util.UUID;
import java.util.Random;

public class Student {
    Random rand = new Random();

    private String studentID;
    private char studentAnswer;
    private char[] possibleAnswers = {'A','B','C','D'};


    public Student(){
        this.studentID = UUID.randomUUID().toString();
        this.studentAnswer = possibleAnswers[rand.nextInt(4)];
    }

    public char getStudentAnswer(){
        return studentAnswer;
    }

    public String getStudentID(){
        return studentID;
    }
}
