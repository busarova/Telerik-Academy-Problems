package slack;

import java.util.ArrayList;

public class Application {

    Channel currentChannel;
    ArrayList<Channel> allChannels;


    void createChannel(Channel newChannel){

        allChannels.add(newChannel);
        currentChannel = newChannel;
    }

    void switchCurrentChannel(Channel nextChannel){

            currentChannel = nextChannel;
    }

    void postMessage(String message){

        currentChannel.messages.add(message);

    }
}
//Application has many channels and one of them is the current channel.
//Application supports the following operations:
//
//
//Create new channel.
//Switch current channel.
//Post message in current channel.
//Like message.
//Download message.
//List message history.
//Clear history.