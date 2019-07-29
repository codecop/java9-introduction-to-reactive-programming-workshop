package reactive;

/**
 * Created by mtumilowicz on 2018-05-21.
 */
public class Main {
    public static void main(String[] args) {
        NumberPublisher numberPublisher = new NumberPublisher();

        PrintingSubscriber<String> printingSubscriber = new PrintingSubscriber<>();
        MappingProcessor<Integer, String> mappingProcessor = new MappingProcessor<>(i -> "new mapping: " + i);
        FilteringProcessor<Integer> filteringProcessor = new FilteringProcessor<>(i -> i % 2 == 0);

//        numberPublisher.subscribe(filteringProcessor);
//        filteringProcessor.subscribe(mappingProcessor);
//        mappingProcessor.subscribe(printingSubscriber);

        numberPublisher.filter(i -> i % 2 == 0)
                .filter(i -> i % 4 == 0)
                .map(i -> "new mapping: " + i)
                .forEachPrint();

        numberPublisher.start();
    }
}
