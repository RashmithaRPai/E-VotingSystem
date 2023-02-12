import java.util.Map;

public class voterRegistry {
    Map<String,voter> voterRegisteryMap;

    public Map<String, voter> getVoterRegisteryMap() {
        return voterRegisteryMap;
    }

    public void setVoterRegisteryMap(Map<String, voter> voterRegisteryMap) {
        this.voterRegisteryMap = voterRegisteryMap;
    }

    public voterRegistry(Map<String, voter> voterRegisteryMap) {
        this.voterRegisteryMap = voterRegisteryMap;
    }

    @Override
    public String toString() {
        return "{" +
                "voterRegisteryMap=" + voterRegisteryMap +
                '}';
    }
}
