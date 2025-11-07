import helperClasses.BankAccountClass;
import helperClasses.MathUtils;
import helperClasses.StaticCounter;

import java.util.Scanner;

class Main{

    static void main() {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);

//         Task 1
         System.out.println(s.sumOfDigits(54));

//         Task 2
        System.out.println("Enter the number for multiplication table");
        s.multiplicationTable(sc.nextInt());

//        task 3
        System.out.println(s.factorial(sc.nextInt()));

//        task 4
        System.out.println(s.reverseNumber(sc.nextInt()));

//        task 5
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\nChoose operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();
        s.calculator(num1, num2, choice);

//        task 6
        BankAccountClass bac = new BankAccountClass(646845168L, "Mohit", 165198491.16);
        bac.displayDetail();

//        task 7
        StaticCounter staticCounter = new StaticCounter();
        StaticCounter staticCounter1 = new StaticCounter();
        staticCounter1.displayCounter();
        StaticCounter staticCounter2 = new StaticCounter();
        staticCounter2.displayCounter();
        staticCounter.displayCounter();

//            task 8
        System.out.println(MathUtils.max(5, 4));
        System.out.println(MathUtils.min(5,4));
        System.out.println(MathUtils.average(new int[]{2, 2, 5}));

//        task 9 Parametarized constructor

    }
}