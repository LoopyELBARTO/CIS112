package Week5;

import java.util.Scanner;

public class Recursive {


    public static int Sum(int result){
        if (result == 0) {
            return 0;
        }
        else
            return result + Sum(result - 1);
    }

    public static int BiPower(int power){
        int base = 2;
        if (power == 0){
            return 1;
        }
        else {
            return (base * BiPower(power-1));
        }
    }

    public static int TimesFive(int number){
        int base = 5;
        if (number == 0){
            return  0;
        }
        else {
            return (base + TimesFive(number - 1 ));
        }
    }

    public static void main(String[] args){
        System.out.print("Please enter a non-negative number: ");

        Scanner keyboard = new Scanner(System.in);
        int inputNumber;
        inputNumber = keyboard.nextInt();

        while (inputNumber <= 1){
            System.out.print("Please enter a non-negative number: ");
            inputNumber = keyboard.nextInt();
        }

        if (inputNumber > 1){
            System.out.println("Sum: " + Sum(inputNumber));
            System.out.println("BiPower: " + BiPower(inputNumber));
            System.out.println("TimesFive: " + TimesFive(inputNumber));
        }
    }
}
