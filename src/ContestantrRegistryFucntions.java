import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class ContestantrRegistryFucntions {
    public void electionComissionCase() {
        System.out.println("1:Enable voter registry process");
        System.out.println("2:Enable contestant registry process");
        System.out.println("3:Allow casting of vote.");
        System.out.println("4:Stop casting of vote");
        System.out.println("5:Declare the election result by city.");
        System.out.println("6:Logout");
    }

    public void contestantRegistry() {
        System.out.println("1:Register your party details");
        System.out.println("2:See all contestants in your city");
        System.out.println("3:Logout");
    }

    public void registerPartyDetails(Scanner sc, contestants contestants, Map<String, String> electionComission, Map<String,
            ArrayList<contestants>> cityContestantRegistry, contestantRegistry contestantRegistry) {
        System.out.println("enter party name:");
        String partyName = sc.next();
        System.out.println("enter party leader name ");
        String partyLeader = sc.next();
        System.out.println("Enter representative name");
        String name = sc.next();
        System.out.println("Enter city ");
        String city = sc.next();
        sc.nextLine();
        System.out.println("Enter age");
        int age = sc.nextInt();
        contestants = new contestants(city, partyName, age, name);
        electionComission.put(partyName, partyLeader);
        electionComission election = new electionComission(partyLeader, partyName, electionComission);
        ArrayList<contestants> contestantListInCity;
        if (cityContestantRegistry.containsKey(city)) {
            contestantListInCity = cityContestantRegistry.get(city);
            contestantListInCity.add(contestants);
            cityContestantRegistry.put(city, contestantListInCity);
        } else {
            contestantListInCity = new ArrayList<>();
            contestantListInCity.add(contestants);
            cityContestantRegistry.put(city, contestantListInCity);
        }
        contestantRegistry = new contestantRegistry(cityContestantRegistry, contestantListInCity);

//        System.out.println(cityContestantRegistry);
    }

    public void contestantsInEveryCity(Map<String, ArrayList<contestants>> cityContestantRegistry) {
        System.out.println("CONTESTANTS IN EVERY CITY");

        for (String i:cityContestantRegistry.keySet()) {

            ArrayList<contestants> contestantListInCity = cityContestantRegistry.get(i);
            System.out.println("\n"+i);
            for (int j = 0; j < contestantListInCity.size(); j++) {
                System.out.print(contestantListInCity.get(j).getName() + " of " + contestantListInCity.get(j).getPartyName()+"\n");
            }

        }

    }

    public void contestantRegistryDisabled() {
        System.out.println("Contestant registry disabled ");
    }
}
