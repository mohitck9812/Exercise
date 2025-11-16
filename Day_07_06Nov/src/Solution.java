import Entity.Student;
import customeException.InvalidEmailException;
import helperClasses.Book;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

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
//    having doubt, should i create a pojo of student of an array or something which should work as db
        public void calculateTotalAndAverage(Student student){
            int total = Arrays.stream(student.marks).sum();
            double average = total/student.marks.length;
            System.out.println("Total marks: " + total);
            System.out.println("And the average of " + student.name + " is: " + average);
        }

        public void averageAndTotalOfAllStudent(List<Student> studentList){
            IntStream allMarks = studentList.stream().flatMapToInt(s -> Arrays.stream(s.marks));

            int total = allMarks.sum();

            double average = studentList.stream()
                    .flatMapToInt(s -> Arrays.stream(s.marks))
                    .average()
                    .orElse(0);

            System.out.println("Total marks of all students: " + total);
            System.out.println("Average marks of all students: " + average);
        }



//    Question 11-> Division with Exception Handling
        public void divisionWithException(int num1, int num2){
            try{
                System.out.println(num1 / num2);
            }catch (Exception e){
                System.out.println("Can not perform division with denominator zero");
            }finally {
                System.out.println("Division Completed");
            }
        }

//        Quesiton 12 -> nested try catch
        public void nestedTryCatch(){
            try {
                int[] numbers = new int[5];

                try {
                    int a = 10, b = 0;
                    int result = a / b;
                    System.out.println("Result: " + result);
                }
                catch (ArithmeticException e) {
                    System.out.println("Caught ArithmeticException: Division by zero not allowed.");
                }
                numbers[10] = 50;
                System.out.println("Value assigned to array.");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid array index.");
            }
            System.out.println("Program continues normally...");
        }

//        Question 14 -> custom Exception
        static void validateEmail(String email) throws InvalidEmailException {
            if (!email.contains("@")) {
            throw new InvalidEmailException("Invalid Email: Missing '@' symbol.");
            } else {
                System.out.println("Valid Email: " + email);
            }
        }
}

