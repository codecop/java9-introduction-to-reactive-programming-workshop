package reactive.answer;

public class RunAnswer7 {

    public static void main(String[] args) {
        chaining(); // step 7
    }
    
    public static void chaining() {
        Step8_NumberPublisherAnswer numberPublisher = new Step8_NumberPublisherAnswer();
        numberPublisher
                .filter(it -> it % 2 == 0)
                .map(it -> "new mapping: "+it)
                .forEachPrint();

        numberPublisher.start();
    }

}
