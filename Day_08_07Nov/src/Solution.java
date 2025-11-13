import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Solution {

//    Quesiton 3 -> to find the first unique character from a string
    public char firstUnique(String str){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(Character c : map.keySet()){
            if(map.get(c) == 1) return c;
        }

        return ' ';
    }

//    Quesiton 4 -> to find the indices of 2 number whose sum is equal to the target
    public int[] sumEqual(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< nums.length; i++){
            map.put(nums[i], i);
        }

        for(Integer i : map.keySet()){

            if(map.get(k-i) != null) return new int[]{map.get(i) , map.get(k-i)};
        }

        return new int[]{-1, -1};
    }

//    Question 5 -> merge 2 sorted arraylist in a sorted arraylist
    public ArrayList<Integer> sortedmergerList(ArrayList<Integer> arr1, ArrayList<Integer> arr2 ){
        ArrayList<Integer> result = new ArrayList<>();
        int i =0 , j = 0;
        while(i < arr1.size() && j < arr2.size()){
            if(arr1.get(i) < arr2.get(j)){
                result.add(arr1.get(i++));
            }else{
                result.add(arr2.get(j++));
            }
        }
        while(i < arr1.size()){
            result.add(arr1.get(i++));
        }

        while(j < arr2.size()){
            result.add(arr2.get(j++));
        }

        return result;
    }

        private boolean turnOfTwo = true;

        synchronized void printTableOfTwo() {
            for (int i = 1; i <= 10; i++) {
                while (!turnOfTwo) {
                    try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
                }
                System.out.println("2 x " + i + " = " + (2 * i));
                turnOfTwo = false;
                notify();
            }
        }

        synchronized void printTableOfFour() {
            for (int i = 1; i <= 10; i++) {
                while (turnOfTwo) {
                    try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
                }
                System.out.println("4 x " + i + " = " + (4 * i));
                turnOfTwo = true;
                notify();
            }
        }


}
