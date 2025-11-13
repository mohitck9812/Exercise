import java.security.Provider;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();


        // question 3
//        System.out.println(s.firstUnique(sc.next()));;

        // question 4
//        System.out.print("Enter number of elements you want to enter in the array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter number in array");
//        for(int i = 0 ; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Enter the target value: ");
//        int k = sc.nextInt();
//        int[] result = s.sumEqual(arr, k);
//        for(int i : result){
//            System.out.println(i);
//        }

//        Question 5 -> to merge 2 sorted array list
            //arraylist 1
//        System.out.print("Enter the number of elements you want to enter in arraylist 1: ");
//        int n = sc.nextInt();
//        ArrayList<Integer> arr1 = new ArrayList<>();
//        System.out.println("Enter elements in arraylist 1: ");
//        for(int i =0; i<n; i++){
//            arr1.add(sc.nextInt());
//        }
//
//        System.out.print("Enter the number of elements you want to enter in arraylist 2: ");
//        n = sc.nextInt();
//        ArrayList<Integer> arr2 = new ArrayList<>();
//        System.out.println("Enter elements in arraylist 2: ");
//        for(int i =0; i<n; i++){
//            arr2.add(sc.nextInt());
//        }
//
//        ArrayList<Integer> res = s.sortedmergerList(arr1, arr2);
//        for(Integer i : res){
//            System.out.println(i);
//        }

//        Question 6 -> printing table
//            Thread t1 = new Thread(() -> s.printTableOfTwo());
//            Thread t2 = new Thread(() -> s.printTableOfFour());
//             t1.start();
//             t2.start();

//        Question 7 -> using Executor Service
        ExecutorService e = Executors.newFixedThreadPool(2);
        e.submit(()-> s.printTableOfTwo());
        e.submit(() -> s.printTableOfFour());

        e.shutdown();


    }
}
