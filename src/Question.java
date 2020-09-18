public interface Question {

    public String getQuestionText();

    public boolean isMultipleChoice();

    public boolean isTrueFalse();

    public boolean isEmpty();

    public void getQuestionChoices();
}
