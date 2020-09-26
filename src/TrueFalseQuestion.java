public class TrueFalseQuestion implements Question {

    // Create QuestionObject, attributes are hardcoded in DriverClass
    private QuestionObject newQuestion;

    // Constructor to create a T/F question
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
