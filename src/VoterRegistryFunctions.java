import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VoterRegistryFunctions {
    public void enableVoterRegistery() {
        System.out.println("1:Enter voters details");
        System.out.println("2:Logout");
    }

    public void enableVotingProcess() {
        System.out.println("3:Start voting process");
    }

    public void voterDetails(Scanner sc, voter voter, Map<String, voter> voterRegisteryMap, voterRegistry voterRegistry) {
        System.out.println("enter voter name");
        String voterName = sc.next();
        System.out.println("enter voter city");
        String city = sc.next();
        sc.nextLine();
        String voterId = city + "_" + voterName.substring(0, 3);
        System.out.println("Enter date of birth\nday:");
        int d = sc.nextInt();
        System.out.println("month:");
        int m = sc.nextInt();
        System.out.println("year:");
        int y = sc.nextInt();
        LocalDate DOB = LocalDate.of(y, m, d);
        System.out.println("Enter the voters OTP");
        int OTP = sc.nextInt();
        voter = new voter(voterName, city, voterId, DOB, OTP);
        voterRegisteryMap.put(voterId, voter);
        voterRegistry = new voterRegistry(voterRegisteryMap);
        return;
    }

    public void voterRegistryClosed() {
        System.out.println("Voter Registry closed");
    }

    public void voitingProcess(Scanner sc, Map<String, voter> voterRegisteryMap,
                               Map<String, ArrayList<contestants>> cityContestantRegistry, Map<String, String> electionComission,
                               Map<String, Map<String, ArrayList<voter>>> electionResult, Map<String, ArrayList<voter>> leaderChosenByVoters,
                               electionParty electionParty) {
        String votedLeader;
        String votedParty;
        ArrayList<voter> votersInCity;
        System.out.println("enter voter name");
        String voterName = sc.next();
        System.out.println("enter voter city");
        String city = sc.next();
        sc.nextLine();
        String voterId = city + "_" + city.substring(0, 4);
        if (voterRegisteryMap.containsKey(voterId)) {
            voter votersData = voterRegisteryMap.get(voterId);
            int noOfTrials = 1;
            while (noOfTrials < 4) {
                System.out.println("Enter the voters OTP");
                int OTP = sc.nextInt();
                if (votersData.getOTP() == OTP) {
                    ArrayList<contestants> contestantListInCity = cityContestantRegistry.get(city);


                    System.out.println("Choose the party from below\n");
                    for (int i = 0; i < contestantListInCity.size(); i++) {
                        contestants contestantData = contestantListInCity.get(i);
                        int no = i + 1;
                        System.out.println(no + contestantData.getPartyName() + "\n");
                    }
                    votedParty = sc.next();
                    votedLeader = electionComission.get(votedParty);
                    ArrayList<voter> votingData;

                    if (electionResult.containsKey(city)) {
                        leaderChosenByVoters = electionResult.get(city);
                        if (leaderChosenByVoters.containsKey(votedLeader)) {
                            votersInCity = leaderChosenByVoters.get(votedLeader);

                        } else {
                            votersInCity = new ArrayList<>();
                        }
                    } else {
                        leaderChosenByVoters = new HashMap<>();
                        votersInCity = new ArrayList<>();
                    }
                    votersInCity.add(voterRegisteryMap.get(voterId));


                    electionResult.put(city, leaderChosenByVoters);


                    noOfTrials = 4;
                    electionParty = new electionParty(electionResult);

                } else {
                    System.out.println("wrong OTP");
                }
            }


        } else {
            System.out.println("Voter name not found in registry");
            return;
        }
    }

    public void votingDisabled() {
        System.out.println("Voting process hasnt begun yet");
    }

    public void Logout() {

    }
}



