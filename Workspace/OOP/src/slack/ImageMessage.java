package slack;

public class ImageMessage extends Message{

    String image;

    public ImageMessage(String author, String timeStamp, String image) {
        super(author, timeStamp);
        this.image = image;
    }

    @Override
    public void showMessage() {

    }
}
