package Concurrency;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SharedState {

    @Test
    public void sharedState(){
        final ExecutorService executorService = Executors.newCachedThreadPool();

        //final SimpleCounter c = new SimpleCounter();
        final AtomicCounter c = new AtomicCounter();
        executorService.execute(new CounterSetter(c));

        //c.setNumber(200);
        final int value = c.getNumber().incrementAndGet();
        //Assertions.assertEquals(200, c.getNumber());
        Assertions.assertEquals(1, value);
    }

    private static class CounterSetter implements Runnable {

        //private final SimpleCounter counter;

        private final AtomicCounter counter;
        /*private CounterSetter(SimpleCounter counter){
            this.counter = counter;
        }*/

        private  CounterSetter(AtomicCounter counter){
            this.counter = counter;
        }

        @Override
        public void run() {
            while (true){
                //counter.setNumber(100);
                counter.getNumber().set(0);
            }
        }
    }
}
