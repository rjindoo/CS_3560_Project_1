public class TrueFalseQuestion implements Question {

    private int counter = 0;
    private QuestionObject newQuestion;

    public TrueFalseQuestion(String questionText, char questionAnswer){
        newQuestion = new QuestionObject(questionText, questionAnswer);
    }

    @Override
    public String getQuestionText() {
        String question = newQuestion.getQuestionText();
        return question;
    }

    @Override
    public void getQuestionChoices() {
        newQuestion.getQuestionOptions();
        ++counter;
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
