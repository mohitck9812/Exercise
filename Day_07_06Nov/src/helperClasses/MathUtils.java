package helperClasses;

public class MathUtils {
    public static int max(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    public static int min(int num1, int num2){
        return num1 < num2 ? num1 : num2;
    }

    public static int average(int[] num){
        int sum = 0;
        for(int i : num){
            sum += i;
        }
        return sum / num.length;
    }
}
