import java.util.*;

public class MultipleChoiceVotingService implements VotingService {
    //private List<Character> studentAnswers = new ArrayList();
    private HashMap<String, Character> studentAnswers = new HashMap();

    public void store(String studentID, char studentAnswer) {
        studentAnswers.put(studentID, studentAnswer);
    }

    public void getResults() {
        studentAnswers.forEach((k,v) -> {
            System.out.println("Student " + k + " answered: " + v);
        });
    }

}
