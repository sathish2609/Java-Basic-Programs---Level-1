// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number % 2 == 0){
            System.out.println(number + " is a Even Number");
        }
        else{
            System.out.println(number + " is a Odd Number");
        }
    }
}