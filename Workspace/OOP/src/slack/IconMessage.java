package slack;

public class IconMessage extends Message {

    String icon;

    public IconMessage(String author, String timeStamp, String icon) {
        super(author, timeStamp);
        this.icon = icon;
    }

    @Override
    public void showMessage() {

    }
}
