public class TrueFalseQuestion implements Question {


    private int counter = 0;

    private String[] questionBank = {
            "True / False"
    };

    @Override
    public String getQuestionText() {
        String question = questionBank[counter];
        ++counter;
        return question;
    }

    @Override
    public boolean isMultipleChoice() {
        return false;
    }

    @Override
    public boolean isTrueFalse() {
        return true;
    }
}
