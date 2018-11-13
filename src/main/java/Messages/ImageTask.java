package Messages;

/**
 * Created by sharo on 11/13/2018.
 */
public class ImageTask {
    private String imageUrl;
    private int n;

    public ImageTask(String imageUrl,int n){
        this.imageUrl = imageUrl;
        this.n = n;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getN() {
        return n;
    }
}
