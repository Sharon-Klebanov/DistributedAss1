package Messages;

/**
 * Created by sharo on 11/13/2018.
 */
public class DoneTask {
    private String urlFileInS3;

    public DoneTask(String urlFileInS3){
        urlFileInS3 = urlFileInS3;
    }

    public String getUrlFileInS3() {
        return urlFileInS3;
    }
}
