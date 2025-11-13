import java.util.concurrent.locks.ReentrantLock;

public class SharedBuffer {
    int[] buffer = new int[5];
    int count = 0;
    int in = 0;
    int out = 0;
    Object obj = new Object();
    public synchronized void producer(int k) throws InterruptedException {
            while (count == buffer.length) wait();

            buffer[in] = k;
            count++;
            in = (in + 1) % buffer.length;

            System.out.println("Producer: " + k);
            notify();
    }
    public synchronized int counsumer() throws InterruptedException{
        while( count == 0) wait();
        int value = buffer[out];
        count--;
        out = (out +1)%buffer.length;
        System.out.println("Consumed: " + value );
        notify();

        return value;
    }

}
