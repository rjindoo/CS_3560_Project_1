public class DriverClass {
    public static void main(String[] args){
        // Create student and question objects voting simulator
        Student[] students = {
                new Student(),
                new Student(),
                new Student()
        };
        Question[] questions = {
                new MultipleChoiceQuestion(),
                new TrueFalseQuestion(),
                new TrueFalseQuestion()
        };

        for(Question q: questions){
            System.out.println("The question is: " + q.getQuestionText());
            if(q.isMultipleChoice()){
                MultipleChoiceVotingService votingService = new MultipleChoiceVotingService();
                for(Student s: students){
                    System.out.println("Student: " + s.getStudentID() + " answered " + s.getStudentAnswer());
                    votingService.store(s.getStudentAnswer());
                }
                votingService.getResults();
            }
            else{
                TrueFalseVotingService votingService = new TrueFalseVotingService();
                for(Student s: students){
                    System.out.println("Student: " + s.getStudentID() + " answered " + s.getStudentAnswer());
                    votingService.store(s.getStudentAnswer());
                }
                votingService.getResults();
            }
        }


    }
}
