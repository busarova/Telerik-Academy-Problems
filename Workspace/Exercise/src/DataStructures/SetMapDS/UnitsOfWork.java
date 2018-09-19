package DataStructures.SetMapDS;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

class Unit implements Comparable {

    String name, type;
    int attack;

    public Unit(String name, String type, int attack) {
        this.name = name;
        this.type = type;
        this.attack = attack;
    }

    @Override
    public String toString() {
        return String.format("%s[%s](%s)", name, type, attack);
    }


    @Override
    public int compareTo(Object o) {
        Unit unit = (Unit) o;
        int attackCompare = Integer.compare(this.attack, unit.attack);
        if (attackCompare != 0) {
            return -attackCompare;
        }
        return this.name.compareTo(unit.name);
    }
}

public class UnitsOfWork {

    private static HashMap<String, Unit> units = new HashMap<>();
    private static HashMap<String, TreeSet<Unit>> allUnitsByType = new HashMap<>();
    private static TreeSet<Unit> orderedUnits = new TreeSet<>();
    private static StringBuilder result = new StringBuilder();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            String[] input = sc.nextLine().trim().split(" ");

            String command = input[0];

            switch (command) {
                case "add":
                    addUnit(input);
                    break;
                case "remove":
                    removeUnit(input);
                    break;
                case "find":
                    findUnit(input);
                    break;
                case "power":
                    powerUnit(input);
                    break;
                case "end":
                    System.out.println(result);
                    return;
            }
        }
    }

    private static void powerUnit(String[] input) {

        int numOfUnits = Integer.parseInt(input[1]);
        int count = 1;
        result.append("RESULT: ");

        for (Unit u : orderedUnits) {

            result.append(u.toString());
            if (count == numOfUnits || count == orderedUnits.size()) {
                break;
            }
            result.append(", ");
            count++;
        }
        result.append("\n");
    }

    private static void findUnit(String[] input) {

        String type = input[1];

        result.append("RESULT: ");
        if (allUnitsByType.containsKey(type)) {

            int count = 1;
            for (Unit u : allUnitsByType.get(type)) {

                result.append(u.toString());
                if (count == 10 || count == allUnitsByType.get(type).size()) {
                    break;
                }
                result.append(", ");
                count++;
            }
        }
        result.append("\n");
    }

    private static void removeUnit(String[] input) {

        String name = input[1];

        if (!units.containsKey(name)) {
            result.append(String.format("FAIL: %s could not be found!\n", name));
        } else {
            Unit unit = units.get(name);
            units.remove(name);
            allUnitsByType.get(unit.type).remove(unit);
            orderedUnits.remove(unit);
            result.append(String.format("SUCCESS: %s removed!\n", name));
        }
    }

    private static void addUnit(String[] input) {

        String name = input[1];
        String type = input[2];
        int attack = Integer.parseInt(input[3]);

        if (units.containsKey(name)) {
            result.append(String.format("FAIL: %s already exists!\n", name));
        } else {
            Unit newUnit = new Unit(name, type, attack);
            units.put(name, newUnit);
            if (!allUnitsByType.containsKey(type)) {
                allUnitsByType.put(type, new TreeSet<>());
            }
            TreeSet<Unit> orderedUnitsByType = allUnitsByType.get(type);
            orderedUnitsByType.add(newUnit);
            orderedUnits.add(newUnit);
            result.append(String.format("SUCCESS: %s added!\n", name));
        }
    }
}
//  static void fakeInput() {
//        String test = "add TheMightyThor God 100\n" +
//                "add Artanis Protoss 250\n" +
//                "add Fenix Protoss 200\n" +
//                "add Spiderman MutatedHuman 180\n" +
//                "add XelNaga God 500\n" +
//                "add Wolverine MutatedHuman 200\n" +
//                "add Zeratul Protoss 300\n" +
//                "add Spiderman MutatedHuman 180\n" +
//                "power 3\n" +
//                "find Protoss\n" +
//                "find God\n" +
//                "remove Kerrigan\n" +
//                "remove XelNaga\n" +
//                "power 3\n" +
//                "find Kerrigan\n" +
//                "find God\n" +
//                "end";
//        System.setIn(new ByteArrayInputStream(test.getBytes()));
//