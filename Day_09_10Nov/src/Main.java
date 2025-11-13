import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    static void main() throws InterruptedException {

//        task 1
//        SharedBuffer sb = new SharedBuffer();
//
//        Thread producer = new Thread(()->{
//            try {
//            for(int i = 0; i < 20; i++){
//                    sb.producer(i);
//                    Thread.sleep(500);
//            }
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//        Thread consumer = new Thread(()-> {
//            try {
//                for(int i = 0; i < 20; i++){
//                    sb.counsumer();
//                    Thread.sleep(900);
//                }
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//        producer.start();
//        consumer.start();
//
//        producer.join();
//        consumer.join();


//        List<Integer> list = Arrays.asList(2, 3, 10, 15, 8, 21, 14, 7);
//        NumberRule isEven = n -> n%2 == 0;
//        NumberRule isPrime = n -> {
//            if (n <= 1) return false;
//            for (int i = 2; i <= Math.sqrt(n); i++) {
//                if (n % i == 0) return false;
//            }
//            return true;
//        };
//
//
//        List<Integer> result = list.stream()
//                .filter(n -> isEven.apply(n) && isPrime.apply(n))
//                .map(n -> n * n)
//                .collect(Collectors.toList());
//
//        Optional<Integer> first = result.stream().findFirst();
//
//        first.ifPresentOrElse(
//                n -> System.out.println("First squared number is: " + n),
//                () -> System.out.println("No matching number found")
//        );

        List<String> words = Arrays.asList("one", "two", "three");
        long count = words.stream()
                .peek(System.out::println)
                .filter(s -> s.length() > 3)
                .count();
        System.out.println("Count: " + count);


    }

}
