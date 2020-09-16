public class DriverClass {
    public static void main(String[] args){
        // Create student and question objects voting simulator
        Student a = new Student();
        Question q = new MultipleChoiceQuestion();

        System.out.println(q.getQuestionText());
        System.out.println(a.getStudentID());
        System.out.println(a.getStudentAnswer());

    }
}
