package Week1;

import java.util.Scanner;

public class ShoppingBagTest {

    private static int counter;
    private static int numberOfItems;
    public static double itemCost;
    public static double tax = 6.0;

    public static int Stop = 0;

    public static void main(String args[]){
        ShoppingBag test = new ShoppingBag(tax);

        Scanner keyboard = new Scanner(System.in);

        do{
            System.out.print("Enter count (use 0 to stop): ");
            numberOfItems = keyboard.nextInt();

            if (numberOfItems == 0)
                break;

            System.out.print("Enter cost: ");
            itemCost = keyboard.nextDouble();

            test.place(numberOfItems, itemCost );

        }
        while (numberOfItems != 0);

        System.out.println(test.toString());

    }
}
