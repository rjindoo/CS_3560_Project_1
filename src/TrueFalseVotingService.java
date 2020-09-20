import java.util.*;

public class TrueFalseVotingService implements VotingService {
    //private List<Character> studentAnswers = new ArrayList();
    private HashMap<String, Character> studentAnswers = new HashMap<>();

    public void store(String studentID, char studentAnswer) {
        if(studentAnswers.containsKey(studentID)){
            studentAnswers.replace(studentID, studentAnswer);
        }
        else {
            studentAnswers.put(studentID, studentAnswer);
        }
    }

    public void getResults() {
        studentAnswers.forEach((k,v) -> {
            System.out.println("Student " + k + " answered: " + v);
        });
    }


}
