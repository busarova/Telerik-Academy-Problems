package slack;

public abstract class Message {

    String author;
    String timeStamp;

    public Message(String author, String timeStamp) {
        this.author = author;
        this.timeStamp = timeStamp;
    }


    public abstract void showMessage();
}
//There are four different types of messages:
//
//
//Text message
//Image message
//Icon message
//File message
//
//
//All messages have author and timestamp and can be identified by the timestamp. Each message type has its specific attribute(s) as well.
//
//Text and Image messages support like operation.
//
//Image and File messages support download operation.