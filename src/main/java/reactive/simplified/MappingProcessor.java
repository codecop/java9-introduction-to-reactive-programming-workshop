package reactive.simplified;

import java.util.function.Function;

class MappingProcessor<In, Out> extends AbstractProcessor<In, Out> {
    private final Function<In, Out> mapper;

    MappingProcessor(Function<In, Out> mapper) {
        this.mapper = mapper;
    }

    @Override
    public void onNext(In item) {
        // submit transformed item by function and request next
        // hint: submit(...), subscription.request(...)
    }
}
