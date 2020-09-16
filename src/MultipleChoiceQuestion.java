import java.util.HashMap;
import java.util.Map;

public class MultipleChoiceQuestion implements Question {

    private int counter = 0;

    private String[] questionBank = {
            "Multiple Choice"
    };

    @Override
    public String getQuestionText() {
        String question = questionBank[counter];
        ++counter;
        return question;
    }


}
