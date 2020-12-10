package reactive.workshop;

public class RunWorkshop7 {

    public static void main(String[] args) {
        chaining(); // step 7
    }

    public static void chaining() {
        Step8_NumberPublisherWorkshop numberPublisher = new Step8_NumberPublisherWorkshop();
        numberPublisher
                .filter(it -> it % 2 == 0)
                .map(it -> "new mapping: "+it)
                .forEachPrint();

        numberPublisher.start();
    }

}
