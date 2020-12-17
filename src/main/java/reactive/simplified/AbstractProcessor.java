package reactive.simplified;

import java.util.concurrent.Flow;

abstract class AbstractProcessor<In, Out> implements Flow.Processor<In, Out> {
    protected Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        // if we already have subscription set - we cancel incoming subscription, hint: cancel()
        // otherwise - set subscription, and request 1 elem, hint: request(1)
    }

    // create SubmissionPublisher field

    @Override
    public void subscribe(Flow.Subscriber<? super Out> subscriber) {
        // subscribe to submissionPublisher with subscriber, hint: subscribe(...)
    }

    @Override
    public void onError(Throwable throwable) {
        // push exception to the channel and close submissionPublisher, hint: closeExceptionally(...)
    }

    @Override
    public void onComplete() {
        // close submissionPublisher, hint: close()
    }

    void submit(Out item) {
        // submit item to submissionPublisher, hint: submit(...)
    }
}
