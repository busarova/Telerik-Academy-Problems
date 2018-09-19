package Inheritance;

import java.util.ArrayList;

public class Hero extends Person {

    String secretIdentity;
    String backStory;
    boolean isGood;
    ArrayList<Power> powers;

    public Hero(String name, int weight,
                Gender gender,
                String secretIdentity,
                String backStory,
                boolean isGood) {

        super(name, weight, gender);

        this.secretIdentity = secretIdentity;
        this.backStory = backStory;
        this.isGood = isGood;
        powers = new ArrayList<>();
    }

    public void addSuperPower(Power power) {

        powers.add(power);
    }

}
