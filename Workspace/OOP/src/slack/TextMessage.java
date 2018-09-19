package slack;

public class TextMessage extends Message {

    String text;

    public TextMessage(String author, String timeStamp, String text) {
        super(author, timeStamp);
        this.text = text;
    }

    @Override
    public void showMessage() {

    }
}
