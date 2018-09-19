package Inheritance;

import java.util.ArrayList;

public class SuperHero extends Hero {

    public SuperHero(String name,
                     int weight,
                     Gender gender,
                     String secretIdentity,
                     String backStory, boolean isGood) {

        super(name, weight, gender, secretIdentity, backStory, isGood);
    }

    public void addSuperPower(Power power){

        powers.add(power);
    }
    public void saveWorld(){

        System.out.println(" saved the world! :D");
    }


}
