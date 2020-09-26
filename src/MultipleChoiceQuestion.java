public class MultipleChoiceQuestion implements Question {

    // Create QuestionObject, attributes hardcoded in DriverClass
    private QuestionObject newQuestion;

    // Constructor to create a Multiple Choice Question
    public MultipleChoiceQuestion(String questionText, char questionAnswer, String answer1, String answer2, String answer3, String answer4){
        newQuestion = new QuestionObject(questionText, questionAnswer, answer1, answer2, answer3, answer4);
    }

    @Override
    public String getQuestionText() {
        String question = newQuestion.getQuestionText();
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

    @Override
    public void getQuestionChoices() {
        newQuestion.getQuestionOptions();
    }
}
