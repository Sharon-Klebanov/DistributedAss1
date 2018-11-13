/**
 * Created by sharo on 11/13/2018.
 */
public class Worker {
    public static void main(String [ ] args){
       // args[0] url for images task queue
        String imageTaskUrlQueue = args[0];
       // args[1] url for done images task queue
        String doneImageTaskUrlQueue = args[1];
        // args[2] n
        int n = Integer.parseInt(args[2]);

        // connect to sqs service
        //get the url for recive message(imageTaskUrlQueue)
        //get the url for sendding message (doneImageTaskUrlQueue)

        for (int i = 0; i < n; i++) {
                // recive message from the imageTaskUrlQueue

                //read the message

                // parse to imageTask class

                //download the image from the url //TODO read apprise from the webite (sends url and it gets you his text)

                // execute OCR algorithm

                // create done image task object

                // parse done image task  to string

                //send done image task to doneImageTaskUrlQueue
        }
    }
}
