import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    // 1. Counting Orcs
    public static class CountOrcs {
        public static int countOrcs(int n, int m, int h) {
            int totalOrcs = 0;
            for (int i = 0; i < h; i++) {
                totalOrcs += n + i * m;
            }
            return totalOrcs;
        }
    }

    // 2. Council of Elrond Votes
    public class CouncilOfElrondVotes {
        public static String councilOfElrondVotes(String[] votes) {
            Map<String, Integer> voteCounts = new HashMap<>();
            voteCounts.put("Yes", 0);
            voteCounts.put("No", 0);
            voteCounts.put("Abstain", 0);

            for (String vote : votes) {
                voteCounts.put(vote, voteCounts.get(vote) + 1);
            }

            if (voteCounts.get("Yes") > voteCounts.get("No") && voteCounts.get("Yes") > voteCounts.get("Abstain")) {
                return "Yes";
            } else if (voteCounts.get("No") > voteCounts.get("Yes") && voteCounts.get("No") > voteCounts.get("Abstain")) {
                return "No";
            } else if (voteCounts.get("Abstain") > voteCounts.get("Yes") && voteCounts.get("Abstain") > voteCounts.get("No")) {
                return "Abstain";
            } else {
                return "Tie";
            }
        }
    }

    // 3. Elvish Code Cipher
    public class ElvishCodeCipher {
        public static String elvishCodeCipher(String s, int n) {
            StringBuilder result = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Character.isLetter(c)) {
                    char base = Character.isLowerCase(c) ? 'a' : 'A';
                    c = (char) ((c - base - n + 26) % 26 + base);
                }
                result.append(c);
            }
            return result.toString();
        }
    }

    // 4. Orthanc Archives Search
    public class OrthancArchivesSearch {
        public static String orthancArchivesSearch(String[] records, String searchTerm) {
            int firstOccurrence = Arrays.asList(records).indexOf(searchTerm);
            int lastOccurrence = Arrays.asList(records).lastIndexOf(searchTerm);

            if (firstOccurrence == -1) {
                return "Record not found";
            } else {
                return "First Occurrence: " + firstOccurrence + "\nLast Occurrence: " + lastOccurrence;
            }
        }
    }

    // 5. Legendary Duels
    public class LegendaryDuels {
        public static String legendaryDuels(String sequence) {
            Stack<Character> stack = new Stack<>();
            for (char c : sequence.toCharArray()) {
                if (c == '(' || c == '!' || c == '{') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) return "Not Legendary";
                    char last = stack.pop();
                    if ((c == ')' && last != '(') || (c == '!' && last != '!') || (c == '}' && last != '{')) {
                        return "Not Legendary";
                    }
                }
            }
            return stack.isEmpty() ? "Legendary" : "Not Legendary";
        }
    }

    // 6. Rohan Cavalry Formation
    public class RohanCavalryFormation {
        public static List<Integer> rohanCavalryFormation(List<Integer> formation, List<String> commands) {
            for (String command : commands) {
                String[] parts = command.split(" ");
                String action = parts[0];

                switch (action) {
                    case "destroy":
                        if (parts.length == 2) {
                            int index = Integer.parseInt(parts[1]);
                            if (index >= 0 && index < formation.size()) {
                                formation.remove(index);
                            }
                        }
                        break;
                    case "swap":
                        if (parts.length == 3) {
                            int index1 = Integer.parseInt(parts[1]);
                            int index2 = Integer.parseInt(parts[2]);
                            if (index1 >= 0 && index1 < formation.size() && index2 >= 0 && index2 < formation.size()) {
                                int temp = formation.get(index1);
                                formation.set(index1, formation.get(index2));
                                formation.set(index2, temp);
                            }
                        }
                        break;
                    case "add":
                        if (parts.length == 2) {
                            int id = Integer.parseInt(parts[1]);
                            formation.add(id);
                        }
                        break;
                    case "insert":
                        if (parts.length == 3) {
                            int id = Integer.parseInt(parts[1]);
                            int index = Integer.parseInt(parts[2]);
                            if (index >= 0 && index <= formation.size()) {
                                formation.add(index, id);
                            }
                        }
                        break;
                    case "center":
                        int len = formation.size();
                        if (len % 2 == 0) {
                            System.out.println(formation.get(len / 2 - 1) + " " + formation.get(len / 2));
                        } else {
                            System.out.println(formation.get(len / 2));
                        }
                        break;
                }
            }
            return formation;
        }
    }
}