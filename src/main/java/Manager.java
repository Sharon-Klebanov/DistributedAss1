import Messages.Task;

/**
 * Created by sharo on 11/13/2018.
 */

public class Manager {

    // private AmazonSqs sqs
    // private AmazonS3 s3
    // private AmazonEcs ecs

    public static void main(String [ ] args){
        //connecting to sqs service
        //connecting to ec2 service  - for creating workers
        //conncecting to s3 service - to download the file

        //create task queue

        //listening to tasks per app
        //for every task in the task queue do execTask with thread
    }

    private void execTask(Task currentTask){
        //create image task queue

        //create done image task queue

        //download the file from s3 (the url in currentTask.getUrlFileInS3)

        //for any line (image url) in the file create image task and send to images task queue
        // count the lines and save it in numImagetasks

        //calculate number of workers = numImagetasks/n (check is there is a reminder so +1 worker)

        // create workers as node in ec2 and send for each the following parameters:
        // 1. image task url
        // 2. done image task utl
        // 3. number of image tasks to execute (no forget about the reminder)

        // declare String output variable

        //listening to the done image task until amount doneImageTasks = numImagetasks
        //for every doneImageTask add it in output variable:
        // urlimag + "\n" + text + "\n"

        //shut down all workers

        // create file with output string

        //add the file in s3

        // creae done task object with url of output file

        // send done task object to currentTask.getResultQueueUrl
    }
}
