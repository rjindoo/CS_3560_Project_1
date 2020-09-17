public class TrueFalseQuestion implements Question {


    private int counter = 0;

    private QuestionObject[] questionBank = {
            new QuestionObject("True False Question POGERSSSSSSS", 'A'),
            new QuestionObject("Is CS fun?", 'A'),
            new QuestionObject("Are traps gay?", 'B')
    };

    @Override
    public String getQuestionText() {
        String question = questionBank[counter].questionText;
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
