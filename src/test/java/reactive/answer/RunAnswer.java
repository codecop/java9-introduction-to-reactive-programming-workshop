package reactive.answer;

public class RunAnswer {

    public static void main(String[] args) {
        imperative(); // steps 1-6
    }
    
    public static void imperative() {
        Step3_NumberPublisherAnswer numberPublisher = new Step3_NumberPublisherAnswer();

        Step6_FilteringProcessorAnswer<Integer> filteringProcessor = new Step6_FilteringProcessorAnswer<>(
            it -> it % 2 == 0
        );

        Step5_MappingProcessorAnswer<Integer, String> mappingProcessor = new Step5_MappingProcessorAnswer<>(
            it -> "new mapping: " + it
        );

        Step2_PrintingSubscriberAnswer<String> printingSubscriber = new Step2_PrintingSubscriberAnswer<>();

        numberPublisher.subscribe(filteringProcessor);
        filteringProcessor.subscribe(mappingProcessor);
        mappingProcessor.subscribe(printingSubscriber);

        numberPublisher.start();
    }
}
