package reactive.answer;

public class RunAnswer {

    public static void main(String[] args) {
        chaining();
        imperative();
    }
    
    public static void chaining() {
        Step8_NumberPublisherAnswer numberPublisher = new Step8_NumberPublisherAnswer();
        numberPublisher
                .filter(it -> it % 2 == 0)
                .map(it -> "new mapping: "+it)
                .forEachPrint();

        numberPublisher.start();
    }

    public static void imperative() {
        Step3_NumberPublisherAnswer numberPublisher = new Step3_NumberPublisherAnswer();

        Step2_PrintingSubscriberAnswer<String> printingSubscriber = new Step2_PrintingSubscriberAnswer<>();
        Step5_MappingProcessorAnswer<Integer, String> mappingProcessor = new Step5_MappingProcessorAnswer<>(
            it -> "new mapping: " + it
        );
        Step6_FilteringProcessorAnswer<Integer> filteringProcessor = new Step6_FilteringProcessorAnswer<>(
            it -> it % 2 == 0
        );

        numberPublisher.subscribe(filteringProcessor);
        filteringProcessor.subscribe(mappingProcessor);
        mappingProcessor.subscribe(printingSubscriber);

        numberPublisher.start();
    }
}
