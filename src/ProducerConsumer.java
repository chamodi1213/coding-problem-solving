import com.oracle.jrockit.jfr.Producer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

    public static void main(String[] args) {

        class ProducerImp implements Runnable {
            private BlockingQueue<String> queue;

            public ProducerImp(BlockingQueue<String> queue){
                this.queue = queue;
            }

            @Override
            public void run(){
                try{
                    queue.put("qwe");
                    queue.put("qwe1");
                    queue.put("qwe2");
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

        class ConsumerImp implements Runnable {
            private BlockingQueue<String> queue;

            public ConsumerImp(BlockingQueue<String> queue){
                this.queue = queue;
            }

            @Override
            public void run(){
                try{
                    System.out.println(queue.take());
                    System.out.println(queue.take());
                    System.out.println(queue.take());
                    System.out.println(queue.take());
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(3);
        ProducerImp producer = new ProducerImp(queue);
        ConsumerImp consumer = new ConsumerImp(queue);
        Thread prodThread = new Thread(producer);
        Thread conThread = new Thread(consumer);

        prodThread.start();
        conThread.start();
    }
}
