package Messages;

/**
 * Created by sharo on 11/13/2018.
 */
public class Task {
    private String urlFileInS3;
    private int n;

    private String resultQueueUrl; //the queue the manager send message to app (done task)

    public Task(String urlFileInS3,int n, String resultQueueUrl){
        this.urlFileInS3 = urlFileInS3;
        this.n = n;
        this.resultQueueUrl = resultQueueUrl;
    }

    public String getUrlFileInS3() {
        return urlFileInS3;
    }

    public int getN() {
        return n;
    }

    public String getResultQueueUrl() {
        return resultQueueUrl;
    }
}
