import java.util.ArrayList;
import java.util.Map;

public class contestantRegistry {
    Map<String, ArrayList<contestants>> cityContestantRegistry;


    public Map<String, ArrayList<contestants>> getCityContestantRegistry() {
        return cityContestantRegistry;
    }

    public void setCityContestantRegistry(Map<String, ArrayList<contestants>> cityContestantRegistry) {
        this.cityContestantRegistry = cityContestantRegistry;
    }


    public contestantRegistry(Map<String, ArrayList<contestants>> cityContestantRegistry, ArrayList<contestants> contestantListInCity) {
        this.cityContestantRegistry = cityContestantRegistry;

    }

    @Override
    public String toString() {
        return "{" +
                "cityContestantRegistry=" + cityContestantRegistry +
                '}';
    }
}
