package Week4;

import ch02.stacks.LinkedStack;

import java.util.Scanner;


public class Bidding<T> extends LinkedStack<T> {











    public static void main(String[] args){
        String STOP = "X";
        String expression = null;
        Bidders Joey = new Bidders();
        Bidders Jane = new Bidders();
        Bidders Bob = new Bidders();
        Bidders Mike = new Bidders();

        Scanner keyboard =  new Scanner(System.in);
        while (!STOP.equals(expression)){
            System.out.println("-----Press " + STOP + " to stop Bid-----");
            expression = keyboard.nextLine();

        }


    }
}
