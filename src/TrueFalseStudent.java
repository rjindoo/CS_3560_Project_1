import java.util.Random;
import java.util.UUID;

public class TrueFalseStudent implements Student {
    Random rand = new Random();

    private String studentID;
    private char studentAnswer;
    private char[] trueFalseAnswers = {'A', 'B'};

    public TrueFalseStudent(){
        this.studentID = UUID.randomUUID().toString();
        this.studentAnswer = trueFalseAnswers[rand.nextInt(trueFalseAnswers.length)];
    }

    @Override
    public char getStudentAnswer(){
        return studentAnswer;
    }

    @Override
    public String getStudentID(){
        return studentID;
    }
}
