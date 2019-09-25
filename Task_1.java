package HomeWork_6;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        try {
        Scanner num = new Scanner(System.in);
        int first, second, result;
        System.out.println("Enter first num");
        first = num.nextInt();
        System.out.println("Enter second num");
        second = num.nextInt();
        result = first / second;
        System.out.println("Result is " + result);


        } catch (ArithmeticException e) {
            System.out.println(String.format("It is impossible to devide by zero"));
        }
            System.out.println("Program is finished");
            {
            }
        }
    }

