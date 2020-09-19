import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultipleChoiceVotingService implements VotingService {
    private List<Character> studentAnswers = new ArrayList();
    private final String TAG = "MultipleChoice";

    public void store(char studentAnswer) {
        studentAnswers.add(studentAnswer);
    }

    public void getResults() {
        Collections.sort(studentAnswers);
        System.out.println(studentAnswers);
    }

    public String getTag(){
        return TAG;
    }
}
