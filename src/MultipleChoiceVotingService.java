import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultipleChoiceVotingService implements VotingService {
    private List<Character> studentAnswers = new ArrayList();

    public void store(char studentAnswer) {
        studentAnswers.add(studentAnswer);
    }

    public void getResults() {
        Collections.sort(studentAnswers);
        System.out.println(studentAnswers);
    }
}
