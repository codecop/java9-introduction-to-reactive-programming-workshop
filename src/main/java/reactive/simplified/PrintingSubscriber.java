package reactive.simplified;

import java.util.concurrent.Flow;

class PrintingSubscriber<T> implements Flow.Subscriber<T> {
    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        // if we already have subscription set - we cancel incoming subscription, hint: cancel()
        // otherwise - set subscription, and request 1 elem, hint: request(1)
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("OnError, message: " + throwable.getLocalizedMessage());
    }

    @Override
    public void onComplete() {
        System.out.println("OnComplete.");
    }

    @Override
    public void onNext(T item) {
        System.out.println("onNext, item: " + item);
        // request next 1 elem, hint: subscription.request(...)
    }
}
