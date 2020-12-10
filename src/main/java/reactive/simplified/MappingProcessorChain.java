package reactive.simplified;

import java.util.function.Function;

class MappingProcessorChain<In, Out> extends MappingProcessor<In, Out>
        implements ChainSupport<Out> {
    MappingProcessorChain(Function<In, Out> mapper) {
        super(mapper);
    }
}
