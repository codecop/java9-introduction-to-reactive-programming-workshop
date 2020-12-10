package reactive.simplified;

import java.util.concurrent.Flow;
import java.util.function.Function;
import java.util.function.Predicate;

interface ChainSupport<In> extends Flow.Publisher<In> {
    default <R> MappingProcessorChain<In, R> map(Function<In, R> map) {
        // create mapping processor, subscribe with it and return it
        // hint: MappingProcessorChain, this.subscribe(...)

        return null;
    }

    default FilteringProcessorChain<In> filter(Predicate<In> p) {
        // create filtering processor, subscribe with it and return it
        // hint: FilteringProcessorChain, this.subscribe(...)

        return null;
    }

    default void forEachPrint() {
        // create printing subscriber and subscribe with it
        // hint: PrintingSubscriber, this.subscribe(...)
    }
}
