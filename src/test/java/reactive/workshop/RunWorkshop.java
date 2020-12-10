package reactive.workshop;

public class RunWorkshop {

    public static void main(String[] args) {
        imperative(); // steps 1-6
    }

    public static void imperative() {
        Step3_NumberPublisherWorkshop numberPublisher = new Step3_NumberPublisherWorkshop();

        Step6_FilteringProcessorWorkshop<Integer> filteringProcessor = new Step6_FilteringProcessorWorkshop<>(
            it -> it % 2 == 0
        );

        Step5_MappingProcessorWorkshop<Integer, String> mappingProcessor = new Step5_MappingProcessorWorkshop<>(
            it -> "new mapping: " + it
        );

        Step2_PrintingSubscriberWorkshop<String> printingSubscriber = new Step2_PrintingSubscriberWorkshop<>();

        numberPublisher.subscribe(filteringProcessor);
        filteringProcessor.subscribe(mappingProcessor);
        mappingProcessor.subscribe(printingSubscriber);

        numberPublisher.start();
    }
}
