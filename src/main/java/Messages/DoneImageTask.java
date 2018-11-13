package Messages;

/**
 * Created by sharo on 11/13/2018.
 */
public class DoneImageTask {
    private String imageUrl;
    private String text;

    public DoneImageTask(String imageUrl, String text) {
        this.imageUrl = imageUrl;
        this.text = text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getText() {
        return text;
    }
}
