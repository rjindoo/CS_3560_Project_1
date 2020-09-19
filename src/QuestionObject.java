public class QuestionObject {
    private final String questionText;
    private final char questionAnswer;
    private String answer1 = null;
    private String answer2 = null;
    private String answer3 = null;
    private String answer4 = null;

    // Constructor used to create T/F questions
    public QuestionObject(String questionText, char questionAnswer){
        this.questionText = questionText;
        this.questionAnswer = questionAnswer;
        this.answer1 = "True";
        this.answer2 = "False";
    }

    //Constructor used to create Multiple Choice questions
    public QuestionObject(String questionText, char questionAnswer, String answer1, String answer2, String answer3, String answer4){
        this.questionText = questionText;
        this.questionAnswer = questionAnswer;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
    }

    public String getQuestionText(){
        return this.questionText;
    }

    public char getQuestionAnswer(){
        return this.questionAnswer;
    }

    public void getQuestionOptions() {
        if(answer3 == null)
            System.out.printf("A: %s\nB: %s\n", answer1, answer2);
        else
            System.out.printf("A: %s\nB: %s\nC: %s\nD: %s\n", answer1, answer2, answer3, answer4);
    }
}
