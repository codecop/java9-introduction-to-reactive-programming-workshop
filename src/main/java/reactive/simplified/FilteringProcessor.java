package reactive.simplified;

import java.util.function.Predicate;

class FilteringProcessor<T> extends AbstractProcessor<T, T> {
    private final Predicate<T> condition;

    FilteringProcessor(Predicate<T> condition) {
        this.condition = condition;
    }

    @Override
    public void onNext(T item) {
        // if predicate is hold - submit item, hint: submit(...)
        // request next, hint: subscription.request(...)
    }
}
