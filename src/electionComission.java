import java.util.Map;

public class electionComission {
    private String partyLeader;
    private String partyName;


    public String getPartyLeader() {
        return partyLeader;
    }

    public void setPartyLeader(String partyLeader) {
        this.partyLeader = partyLeader;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }



    public electionComission(String partyLeader, String partyName, Map<String, String> electionComission) {
        this.partyLeader = partyLeader;
        this.partyName = partyName;

    }

    @Override
    public String toString() {
        return "{" +
                "partyLeader='" + partyLeader + '\'' +
                ", partyName='" + partyName + '\'' +
                '}';
    }
}
