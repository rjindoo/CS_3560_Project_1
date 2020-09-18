import java.util.Random;
import java.util.UUID;

public class MultipleChoiceStudent implements Student {
    Random rand = new Random();

    private String studentID;
    private char studentAnswer;
    private char[] multipleChoiceAnswers = {'A', 'B', 'C', 'D'};

    public MultipleChoiceStudent(){
        this.studentID = UUID.randomUUID().toString();
        this.studentAnswer = multipleChoiceAnswers[rand.nextInt(multipleChoiceAnswers.length)];
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
