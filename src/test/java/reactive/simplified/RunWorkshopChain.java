package reactive.simplified;

public class RunWorkshopChain {

    public static void main(String[] args) {
        NumberPublisherChain numberPublisher = new NumberPublisherChain();
        
        numberPublisher
                .filter(it -> it % 2 == 0)
                .map(it -> "new mapping: "+it)
                .forEachPrint();

        numberPublisher.start();
    }

}
