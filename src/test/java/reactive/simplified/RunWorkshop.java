package reactive.simplified;

public class RunWorkshop {

    public static void main(String[] args) {
        PositiveNumberPublisher numberPublisher = new PositiveNumberPublisher();

        FilteringProcessor<Integer> filteringProcessor = new FilteringProcessor<>(
            it -> it % 2 == 0
        );

        MappingProcessor<Integer, String> mappingProcessor = new MappingProcessor<>(
            it -> "new mapping: " + it
        );

        PrintingSubscriber<String> printingSubscriber = new PrintingSubscriber<>();

        numberPublisher.subscribe(filteringProcessor);
        filteringProcessor.subscribe(mappingProcessor);
        mappingProcessor.subscribe(printingSubscriber);

        numberPublisher.start();
    }
}
