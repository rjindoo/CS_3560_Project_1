import java.util.HashMap;
import java.util.Map;

public class MultipleChoiceQuestion implements Question {

    private int counter = 0;

    private QuestionObject[] questionBank = {
            new QuestionObject("The answer is D", 'D'),
            new QuestionObject("What is President Obama's Last Name?", 'C'),
            new QuestionObject("Kelly has stolen your CS, what do you do?", 'A')
    };

    @Override
    public String getQuestionText() {
        String question = questionBank[counter].questionText;
        ++counter;
        return question;
    }

    @Override
    public boolean isMultipleChoice() {
        return true;
    }

    @Override
    public boolean isTrueFalse() {
        return false;
    }
}
