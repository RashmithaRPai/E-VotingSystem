import java.util.ArrayList;
import java.util.Map;

public class electionParty {
    Map<String, Map<String, ArrayList<voter>>> electionResult;

    public Map<String, Map<String, ArrayList<voter>>> getElectionResult() {
        return electionResult;
    }

    public void setElectionResult(Map<String, Map<String, ArrayList<voter>>> electionResult) {
        this.electionResult = electionResult;
    }

    public electionParty(Map<String, Map<String, ArrayList<voter>>> electionResult) {
        this.electionResult = electionResult;
    }

    @Override
    public String toString() {
        return "{" +
                "electionResult=" + electionResult +
                '}';
    }
}
