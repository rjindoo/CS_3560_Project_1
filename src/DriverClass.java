public class DriverClass {
    public static void main(String[] args){
        // Create student and question objects voting simulator
        simulateVoting();
    }

    private static void simulateVoting(){
        Question[] questions = {
                new MultipleChoiceQuestion("What is 2+2", 'A', "4", "3", "7", "0"),
                new MultipleChoiceQuestion("What is 9+10", 'C', "21", "-1", "19", "1"),
                new TrueFalseQuestion("The Capital of California is Sacramento", 'A')
        };

        // Loop through question object array to simulate student voting
        for(Question q: questions) {
            System.out.println("\nThe question is: " + q.getQuestionText()); // Display question text
            q.getQuestionChoices(); // Display question choices
            if (q.isMultipleChoice()) {
                MultipleChoiceVotingService votingService = new MultipleChoiceVotingService();
                createStudents(votingService); // create students to simulate answering
                votingService.getResults(); // store results from student object answers
            }
            else {
                TrueFalseVotingService votingService = new TrueFalseVotingService();
                createStudents(votingService);
                votingService.getResults();
            }
        }
    }

    private static void createStudents(VotingService votingService){
        for(int i=0; i<5; i++) {
            Student student = new MultipleChoiceStudent();
            votingService.store(student.getStudentAnswer());
        }
    }

}
