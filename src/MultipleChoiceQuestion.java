public class MultipleChoiceQuestion implements Question {

    private int counter = 0;
    private QuestionObject newQuestion;

    // CONSIDER USING CONSTRUCTOR TO CREATE INDIVIDUAL QUESTION OBJECTS
    public MultipleChoiceQuestion(String questionText, char questionAnswer, String answer1, String answer2, String answer3, String answer4){
        newQuestion = new QuestionObject(questionText, questionAnswer, answer1, answer2, answer3, answer4);
    }

    /*
    private QuestionObject[] questionBank = {
            new QuestionObject("The answer is D", 'D'),
            new QuestionObject("What is President Obama's Last Name?", 'C'),
            new QuestionObject("Kelly has stolen your CS, what do you do?", 'A')
    };*/

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
        //questionBank[counter].getQuestionOptions();
        newQuestion.getQuestionOptions();
        ++counter;
    }
}
