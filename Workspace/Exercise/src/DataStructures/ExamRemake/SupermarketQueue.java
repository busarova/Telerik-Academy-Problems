package DataStructures.ExamRemake;

import java.util.*;

public class SupermarketQueue {
    private static List<String> marketQueue = new ArrayList<>();
    private static HashMap<String, Integer> namesCount = new HashMap<>();
    private static StringBuilder result = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();
            String[] params = input.split(" ");

            switch (params[0]) {
                case "Append":
                    append(params[1]);
                    break;
                case "Insert":
                    insert(Integer.parseInt(params[1]), params[2]);
                    break;
                case "Find":
                    find(params[1]);
                    break;
                case "Serve":
                    serve(Integer.parseInt(params[1]));
                    break;
                case "End":
                    System.out.println(result);
                    return;
            }
        }

    }

    public static void append(String name) {
        marketQueue.add(name);
        if (!namesCount.containsKey(name)) {
            namesCount.put(name, 0);
        }

        int count = namesCount.get(name) + 1;
        namesCount.put(name, count);

        result.append("OK\n");
    }

    public static void insert(int pos, String name) {

        if (pos >= 0 && pos <= marketQueue.size()) {

            marketQueue.add(pos, name);

            if (!namesCount.containsKey(name)) {
                namesCount.put(name, 0);
            }

            int count = namesCount.get(name) + 1;
            namesCount.put(name, count);
            result.append("OK\n");

        } else {
            result.append("Error\n");
        }

    }
        public static void find (String name){
            if (namesCount.containsKey(name)) {
                result.append(namesCount.get(name) + "\n");
            } else {
                result.append("0\n");
            }
        }

        public static void serve ( int numberOfPeople){
            if (numberOfPeople <= marketQueue.size()) {

                List<String> toRemove = new ArrayList<>();
                for (int i = 0; i < numberOfPeople; i++) {

                    result.append(marketQueue.get(i)).append(" ");
                    toRemove.add(marketQueue.get(i));
                    int count = namesCount.get(marketQueue.get(i)) - 1;
                    namesCount.put(marketQueue.get(i), count);
                }

                result.deleteCharAt(result.length() - 1);
                result.append("\n");
                marketQueue.removeAll(toRemove);

            } else {
                result.append("Error\n");
            }
        }
    }
