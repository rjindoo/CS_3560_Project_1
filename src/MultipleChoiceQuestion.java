public class MultipleChoiceQuestion implements Question {

    private int counter = 0;

    // CONSIDER USING CONSTRUCTOR TO CREATE INDIVIDUAL QUESTION OBJECTS
    public MultipleChoiceQuestion(){
        counter = 0;
    }

    private QuestionObject[] questionBank = {
            new QuestionObject("The answer is D", 'D'),
            new QuestionObject("What is President Obama's Last Name?", 'C'),
            new QuestionObject("Kelly has stolen your CS, what do you do?", 'A')
    };

    @Override
    public String getQuestionText() {
        String question = questionBank[counter].getQuestionText();
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
    public boolean isEmpty(){
        if(counter > questionBank.length-1){
            return true;
        }
        return false;
    }

    @Override
    public void getQuestionChoices() {
        questionBank[counter].getQuestionOptions();
        ++counter;
    }
}
