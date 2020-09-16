import java.util.HashMap;
import java.util.Map;

public class MultipleChoiceQuestion implements Question {

    private int counter = 0;

    public String[] questionBank = {
            "Multiple Choice"
    };

    @Override
    public String getQuestionText() {
        String question = questionBank[counter];
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
