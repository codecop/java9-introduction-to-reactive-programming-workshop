package reactive.simplified;

import java.util.function.Predicate;

class FilteringProcessorChain<T> extends FilteringProcessor<T> implements ChainSupport<T> {
    FilteringProcessorChain(Predicate<T> condition) {
        super(condition);
    }
}
