import java.util.concurrent.ExecutorService;

public class ThreadTesting {
    static void main() throws InterruptedException {
        Queue queue = new Queue();
        Thread t1 = new Thread(queue);
        t1.start();

//        ExecutorService executor = new
    }
}

class Queue implements Runnable{
    private Integer data;

    public void producer(int k ) throws InterruptedException {
        while(data != null){
            wait();
        }
        data = k;
        notify();
    }

    public void consumer() throws InterruptedException {
        while (data == null){
            wait();
        }
        System.out.println("Consume: " + data);
        data = null;
        notify();
    }

    @Override
    public void run() {

    }
}
