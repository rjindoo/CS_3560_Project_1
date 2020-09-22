import java.util.*;

public class MultipleChoiceVotingService implements VotingService {
    private HashMap<String, Character> studentAnswers = new HashMap();

    public void store(String studentID, char studentAnswer) {
        studentAnswers.put(studentID, studentAnswer);
    }

    public void getResults() {
        int[] lst = new int[4];
        studentAnswers.forEach((k,v) -> {
            if(v == 'A'){
                lst[0] += 1;
            }
            else if(v == 'B'){
                lst[1] += 1;
            }
            else if(v == 'C'){
                lst[2] += 1;
            }
            else{
                lst[3] += 1;
            }
        });
        System.out.printf("Students answered A: %d\n" +
                "Students answered B: %d\n"+
                "Students answered C: %d\n"+
                "Students answered D: %d\n",lst[0], lst[1], lst[2], lst[3]);
    }

}
