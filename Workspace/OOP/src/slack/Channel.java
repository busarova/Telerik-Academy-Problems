package slack;

import java.util.ArrayList;

public class Channel {

    String name;
    ArrayList<String> messages;

    public Channel(String name, ArrayList<String> messages) {
        this.name = name;
        this.messages = new ArrayList<>();
    }


}
//Create new channel.
//Switch current channel.
//Post message in current channel.
//Like message.
//Download message.
//List message history.
//Clear history.
//
//
//Channels have name and can be identified by the name.
