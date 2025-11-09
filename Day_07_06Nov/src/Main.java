import Entity.Customer;
import Entity.Employee;
import Entity.Product;
import customeException.InsufficientFundsException;
import customeException.InvalidAmountException;
import customeException.InvalidEmailException;
import helperClasses.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{

    static void main() {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);

//         Task 1
//         System.out.println(s.sumOfDigits(54));

//         Task 2
//        System.out.println("Enter the number for multiplication table");
//        s.multiplicationTable(sc.nextInt());

//        task 3
//        System.out.println(s.factorial(sc.nextInt()));

//        task 4
//        System.out.println(s.reverseNumber(sc.nextInt()));

//        task 5
//        System.out.print("Enter first number: ");
//        double num1 = sc.nextDouble();
//
//        System.out.print("Enter second number: ");
//        double num2 = sc.nextDouble();
//
//        System.out.println("\nChoose operation:");
//        System.out.println("1. Addition (+)");
//        System.out.println("2. Subtraction (-)");
//        System.out.println("3. Multiplication (*)");
//        System.out.println("4. Division (/)");
//
//        System.out.print("Enter your choice (1-4): ");
//        int choice = sc.nextInt();
//        s.calculator(num1, num2, choice);

//        task 6
//        BankAccountClass bac = new BankAccountClass(646845168L, "Mohit", 165198491.16);
//        bac.displayDetail();

//        task 7
//        StaticCounter staticCounter = new StaticCounter();
//        StaticCounter staticCounter1 = new StaticCounter();
//        staticCounter1.displayCounter();
//        StaticCounter staticCounter2 = new StaticCounter();
//        staticCounter2.displayCounter();
//        staticCounter.displayCounter();

//            task 8
//        System.out.println(MathUtils.max(5, 4));
//        System.out.println(MathUtils.min(5,4));
//        System.out.println(MathUtils.average(new int[]{2, 2, 5}));

//        Question 9 -> Parametrized Constructor
//        Book book = new Book("Atomic Habit", "James Clear", 500);
//        book.displayDetail();

//        Question 10-> Constructor Overloading
//        Car car1 = new Car("Mustang Mach 1");
//        Car car2  = new Car("Shelby Mustang", 500000);

//        Question 11 -> division with exception
//        System.out.print("Enter numerator: ");
//        int num1 = sc.nextInt();
//        System.out.print("Enter denominator: ");
//        int num2 = sc.nextInt();
//        s.divisionWithException(num1, num2);


//         Question 12 -> Nested Try-Catch
//        s.nestedTryCatch();

//        Question 13 -> Exception Propagation
//            ExpceptionPropagation obj = new ExpceptionPropagation();
//        try {
//            obj.m1();
//        } catch (ArithmeticException e) {
//            System.out.println("Exception handled in main(): " + e);
//        }

//        Question 14 -> Custom Exception
//        String[] emails = {"mohit.ck", "user@example.com", "hello.world"};
//
//        for (String email : emails) {
//            try {
//                s.validateEmail(email);
//            } catch (InvalidEmailException e) {
//                System.out.println("Caught Exception → " + e.getMessage());
//            }
//        }
//
//        System.out.println("Email validation completed.");

//        Question 15 -> Pojo
//        List<Customer> customers = new ArrayList<>();
//
//        customers.add(new Customer(1, "Mohit", "mohit@example.com"));
//        customers.add(new Customer(2, "Lalit", "lalit@example.com"));
//        customers.add(new Customer(3, "Manpreet", "manu@example.com"));
//
//        System.out.println("Customer Details:");
//        for (Customer c : customers) {
//            System.out.println(c);
//        }

//        Question 16 -> Mini banking app
//        try {
//            BankAccount acc1 = new BankAccount("Mohit", 5000);
//            BankAccount acc2 = new BankAccount("Lalit", 2000);
//
//            acc1.deposit(1500);
//            acc1.withdraw(3000);
//
//            acc2.deposit(1000);
//            acc2.withdraw(5000);
//
//            System.out.println("\nAccount Details:");
//            acc1.displayAccountDetails();
//            acc2.displayAccountDetails();
//
//            System.out.println("\nTotal Accounts Created: " + BankAccount.getTotalAccounts());
//
//        } catch (InvalidAmountException | InsufficientFundsException e) {
//            System.out.println("Error: " + e.getMessage());
//        }

//        Question 17 -> Employee Management System
//        List<Employee> employees = new ArrayList<>();
//
//        employees.add(new FullTimeEmployee(1, "Mohit", 50000));
//        employees.add(new PartTimeEmployee(2, "Lalit", 80, 300));
//        employees.add(new FullTimeEmployee(3, "Manpreet Singh", 60000));
//        employees.add(new PartTimeEmployee(4, "Shreya Mathur", 100, 250));
//
//        System.out.println("Employee Salary Details:");
//        for (Employee emp : employees) {
//            emp.displayInfo(); // Calls overridden method
//        }

//        Question 18 -> Product catalog
//        try {
//            // Creating product objects
//            Product p1 = new Product(101, "Laptop", 65000);
//            Product p2 = new Product(102, "Smartphone", 30000);
//            Product p3 = new Product(103, "Headphones", 2500);
//            Product p5 = new Product(105, "Tablet", 20000);
//
//            // Display product details
//            System.out.println("Product Catalog:");
//            p1.displayProduct();
//            p2.displayProduct();
//            p3.displayProduct();
//            p5.displayProduct();
//
//        } catch (InvalidAmountException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
    }

}