public class DriverClass {

    public static void main(String[] args){
        // Create student and question objects voting simulator
        simulateVoting();
    }

    private static void simulateVoting(){
        Question[] questions = {
                new MultipleChoiceQuestion("What is 2+2", 'A', "4", "3", "7", "0"),
                new MultipleChoiceQuestion("What is 9+10", 'C', "21", "-1", "19", "1"),
                new TrueFalseQuestion("The Capital of California is Sacramento", 'A'),
                new TrueFalseQuestion("Gareth Bale plays for Real Madrid", 'B')
        };

        // Loop through question object array and simulate student voting
        for(Question q: questions) {

            // Display question text
            System.out.println("\nThe question is: " + q.getQuestionText());

            q.getQuestionChoices();
            if (q.isMultipleChoice()) {
                MultipleChoiceVotingService votingService = new MultipleChoiceVotingService();
                createMultipleChoiceStudents(votingService); // create students to simulate answering
                votingService.getResults(); // store results from student object answers
            }
            else {
                TrueFalseVotingService votingService = new TrueFalseVotingService();
                createTrueFalseStudents(votingService);
                votingService.getResults();
            }
        }
    }

    private static void createMultipleChoiceStudents(VotingService votingService){
        for(int i=0; i<5; i++) {
            Student student = new MultipleChoiceStudent();
            votingService.store(student.getStudentID(), student.getStudentAnswer());

            // Showing that if a student resubmits their answer will be updated
            if(i % 2 == 0)
                votingService.store(student.getStudentID(), student.getStudentAnswer());
        }
    }
    private static void createTrueFalseStudents(VotingService votingService){
        for(int i=0; i<5; i++) {
            Student student = new TrueFalseStudent();
            votingService.store(student.getStudentID(), student.getStudentAnswer());

            // Showing that if a student resubmits their answer will be updated
            if(i % 2 == 0)
                votingService.store(student.getStudentID(), student.getStudentAnswer());
        }
    }

}
