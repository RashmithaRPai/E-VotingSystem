import java.util.ArrayList;
import java.util.Map;

public class ElectionPartyFunction {
    public void options() {
        System.out.println("1:Election Commission");
        System.out.println("2:voters");
        System.out.println("3:Election party");
    }

    public void electionResult(Map<String, Map<String, ArrayList<voter>>> electionResult, Map<String, ArrayList<voter>> leaderChosenByVoters) {
        for (int i = 0; i < electionResult.size(); i++) {
            System.out.println(electionResult.get(i) + " : ");
            int max = 1;
            String leaderWithMaxVotes = " ";
            leaderChosenByVoters = electionResult.get(i);
            for (String j : leaderChosenByVoters.keySet()) {
                if (leaderChosenByVoters.size() > max) {
                    max = leaderChosenByVoters.size();
                    leaderWithMaxVotes = j;
                } else {
                    leaderWithMaxVotes = j;
                }
                System.out.println(leaderWithMaxVotes);
            }
        }
    }
}
