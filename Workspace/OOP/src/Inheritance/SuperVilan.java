package Inheritance;

import java.util.ArrayList;

public class SuperVilan extends  Hero{

    public SuperVilan(String name,
                      int weight,
                      Gender gender,
                      String secretIdentity,
                      String backStory,
                      boolean isGood) {

        super(name, weight, gender, secretIdentity, backStory, isGood);
    }
    public void addSuperPower(Power power) {

        powers.add(power);
    }

    public void destroy(){

        System.out.println(" destroyed the world! :D");
    }
}
