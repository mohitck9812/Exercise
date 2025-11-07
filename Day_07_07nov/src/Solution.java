public class Solution {

    // question 1
    public long sumOfDigits(int num){
        if (num ==0 ) return 0;

        return num % 10 + sumOfDigits(num /10);
    }

    //question 2
    public void multiplicationTable(int n){
        for(int i = 1 ; i < 11 ; i++) System.out.printf("%d * %d = %d \n", n , i , n * i);
    }

//    Question 3 -> factorial calculator
    public long factorial(int num){
        if ( num == 0 || num == 1 ) return 1;
        return num * factorial(num -1);
    }

//    Question 4 -> reverse a number using while loop
    public int reverseNumber(int num){
        int result = 0;
        while(num != 0){
            result = (result * 10 ) + (num % 10);
            num = num/10;
        }
        return result;
    }


//    Question 5 -> Simple Calculator
public double add(double a, double b) {
    return a + b;
}

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }
    public double calculator(double num1 ,double num2, int choice){
        double result = 0;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        return result;
    }

//    Question 6 -> Student report
//    having doubt, should i crreate a pojo of student of an array or something which should work as db


}
