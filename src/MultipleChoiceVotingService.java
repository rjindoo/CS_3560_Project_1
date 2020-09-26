import java.util.*;

public class MultipleChoiceVotingService implements VotingService {
    private HashMap<String, Character> studentAnswers = new HashMap();

    public void store(String studentID, char studentAnswer) {
        // Check HashMap to see if student has submitted a response
        if(studentAnswers.containsKey(studentID)){
            System.out.printf("Student %s has changed their answer\n", studentID);
            studentAnswers.replace(studentID, studentAnswer);
        }
        else {
            studentAnswers.put(studentID, studentAnswer);
        }
    }

    public void getResults() {
        int[] lst = new int[4];
        // iterate over HashMap and increment lst indices (0 - 3 correspond to A,B,C,D)
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
