//2 number ko add, multiply sub and divide

import java.util.function.BiFunction;

public class Demo  {
    static BiFunction<Integer, Integer, Integer> add = (Integer num1, Integer num2) -> num1 + num2;
    static BiFunction<Integer, Integer, Integer> sub = (Integer num1, Integer num2) -> num1 - num2;
    static BiFunction<Integer, Integer, Integer> multiply = (Integer num1, Integer num2) -> num1 * num2;
    static BiFunction<Integer, Integer, Integer> division = (Integer num1, Integer num2) -> num1 / num2;


    static void main() {
        System.out.println("addition: " + add.apply(5,4));
        System.out.println("Subtraction: " + sub.apply(6,3));
        System.out.println("Multiply: " + multiply.apply(2,4));
        System.out.println("Division: " + division.apply(4,2));

    }

}
