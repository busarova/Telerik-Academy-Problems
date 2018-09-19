package slack;

public class FileMessage extends Message {

    String file;

    public FileMessage(String author, String timeStamp, String file) {
        super(author, timeStamp);
        this.file = file;
    }

    @Override
    public void showMessage() {

    }
}
