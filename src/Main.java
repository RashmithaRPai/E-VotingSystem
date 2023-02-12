import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, ArrayList<voter>> finalElectionOutcome = new HashMap<>();

        Map<String, ArrayList<contestants>> cityContestantRegistry = new HashMap<>();
        Map<String, String> electionComission = new HashMap<>();
        Map<String, voter> voterRegisteryMap = new HashMap<>();
        Map<String, Map<String, ArrayList<voter>>> electionResult = new HashMap<>();
        Map<String, ArrayList<voter>> leaderChosenByVoters = null;

        boolean enableVoterRegistery = false;
        boolean enableContestantRegistry = false;
        boolean enableVotingProcess = false;
        voter voter = null;
        voterRegistry voterRegistry = new voterRegistry(voterRegisteryMap);
        contestants contestants = null;
        contestantRegistry contestantRegistry = null;
        electionParty electionParty = null;
        while (true) {
            ContestantrRegistryFucntions ContestantrRegistryFucntions = new ContestantrRegistryFucntions();
            VoterRegistryFunctions VoterRegistryFunctions = new VoterRegistryFunctions();
            ElectionPartyFunction ElectionPartyFunction = new ElectionPartyFunction();
            ElectionPartyFunction.options();

            int option = sc.nextInt();
            switch (option) {
                case 1: {
                    ContestantrRegistryFucntions.electionComissionCase();
                    int electionComissionCase = sc.nextInt();
                    switch (electionComissionCase) {
                        case 1: {
                            enableVoterRegistery = true;
                            break;
                        }
                        case 2: {
                            enableContestantRegistry = true;
                            enableVoterRegistery = false;
                            enableVotingProcess=false;

                            break;
                        }
                        case 3: {
                            enableVotingProcess = true;
                            enableVoterRegistery = true;

                            break;
                        }
                        case 4: {
                            enableVoterRegistery = false;
                            enableContestantRegistry = false;
                            enableVotingProcess = false;
                            break;
                        }
                        case 5: {
                            ElectionPartyFunction.electionResult(electionResult, leaderChosenByVoters);

                        }
                        case 6: {
                            break;
                        }

                    }
                    break;
                }
                case 2: {
                    if (enableVoterRegistery == true) {
                        VoterRegistryFunctions.enableVoterRegistery();
                        if (enableVotingProcess) {
                            enableVoterRegistery = false;
                            VoterRegistryFunctions.enableVotingProcess();
                        }
                        int voterOption = sc.nextInt();
                        switch (voterOption) {
                            case 1: {
                                if (enableVoterRegistery) {
                                    VoterRegistryFunctions.voterDetails(sc, voter, voterRegistry.getVoterRegisteryMap(), voterRegistry);
                                    break;
                                } else {
                                    VoterRegistryFunctions.voterRegistryClosed();
                                }
                            }
                            case 2: {
                                break;
                            }
                            case 3: {
                                if (!enableVoterRegistery) {
                                    VoterRegistryFunctions.voitingProcess(sc, voterRegisteryMap, cityContestantRegistry, electionComission, electionResult, leaderChosenByVoters, electionParty);
                                } else {
                                    VoterRegistryFunctions.votingDisabled();
                                    break;
                                }
                            }
                        }
                    } else {
                        VoterRegistryFunctions.Logout();
                        break;
                    }
                }
                case 3: {
                    if (enableContestantRegistry) {

                        ContestantrRegistryFucntions.contestantRegistry();
                        int contestantRegistryOption = sc.nextInt();
                        switch (contestantRegistryOption) {
                            case 1: {
                                ContestantrRegistryFucntions.registerPartyDetails(sc, contestants, electionComission, cityContestantRegistry, contestantRegistry);
                                break;
                            }
                            case 2: {
                                ContestantrRegistryFucntions.contestantsInEveryCity(cityContestantRegistry);
                                break;
                            }
                            case 3: {
                                break;
                            }
                        }
                    } else {
                        ContestantrRegistryFucntions.contestantRegistryDisabled();
                    }
                }

            }
        }
    }
}



























