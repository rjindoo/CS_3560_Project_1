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
        int[] lst = new int[2];
        studentAnswers.forEach((k,v) -> {
            if(v == 'A'){
                lst[0] += 1;
            }
            else{
                lst[1] += 1;
            }
        });
        System.out.printf("Students answered A: %d\n" +
                          "Students answered B: %d\n", lst[0], lst[1]);
    }


}
