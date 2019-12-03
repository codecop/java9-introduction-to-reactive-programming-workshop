package reactive.workshop;

public class RunWorkshop {

    public static void main(String[] args) {
        chaining();
        imperative();
    }

    public static void chaining() {
        Step8_NumberPublisherWorkshop numberPublisher = new Step8_NumberPublisherWorkshop();
        numberPublisher
                .filter(it -> it % 2 == 0)
                .map(it -> "new mapping: "+it)
                .forEachPrint();

        numberPublisher.start();
    }

    public static void imperative() {
        Step3_NumberPublisherWorkshop numberPublisher = new Step3_NumberPublisherWorkshop();

        Step2_PrintingSubscriberWorkshop<String> printingSubscriber = new Step2_PrintingSubscriberWorkshop<>();
        Step5_MappingProcessorWorkshop<Integer, String> mappingProcessor = new Step5_MappingProcessorWorkshop<>(
            it -> "new mapping: " + it
        );
        Step6_FilteringProcessorWorkshop<Integer> filteringProcessor = new Step6_FilteringProcessorWorkshop<>(
            it -> it % 2 == 0
        );

        numberPublisher.subscribe(filteringProcessor);
        filteringProcessor.subscribe(mappingProcessor);
        mappingProcessor.subscribe(printingSubscriber);

        numberPublisher.start();
    }
}
