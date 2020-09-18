public class TrueFalseQuestion implements Question {


    private int counter = 0;

    private QuestionObject[] questionBank = {
            new QuestionObject("True / False Question", 'B'),
            new QuestionObject("Is CS fun?", 'A'),
            new QuestionObject("This one should be true.", 'B')
    };

    @Override
    public String getQuestionText() {
        String question = questionBank[counter].getQuestionText();
        return question;
    }

    @Override
    public void getQuestionChoices() {
        questionBank[counter].getQuestionOptions();
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

    @Override
    public boolean isEmpty(){
        if(counter > questionBank.length-1){
            return true;
        }
        return false;
    }
}
