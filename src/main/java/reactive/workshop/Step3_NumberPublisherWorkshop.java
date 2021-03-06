package reactive.workshop;

import java.util.concurrent.SubmissionPublisher;
import java.util.stream.IntStream;

class Step3_NumberPublisherWorkshop extends SubmissionPublisher<Integer> {

    void start() {
        // generate infinite stream of numbers, submit and sleep for each number
        // hint: IntStream, iterate, submit, sleep
    }

    private void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
