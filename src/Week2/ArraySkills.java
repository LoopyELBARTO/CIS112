package Week2;

import java.util.Random;
import java.util.Scanner;

public class ArraySkills {
    public static void main(String[] args) {
        System.out.println(
                "==============================LISTED=============================");

        // ***********************
        // For each item below you must code the solution. You may not use any of the
        //  methods found in the Arrays class or the Collections classes
        //

        String[] myData;

        // 1. Instantiate the given array to hold 10 Strings
        myData = new String[10];

        // 2. Add your name to the Array at index 0 and a friend's name to the Array at index 4
        myData[0] = "Robert";
        myData[4] = "Martin";


        // 3. Move your friend's name to index 0 in the array and "delete" their name from index 4

        myData[0] = "Martin";
        myData[4] = "Mora";

        // 4. Fill up all of the remaining indeces in the array with more names
        myData[1] = "Bobby";
        myData[2] = "Dayle";
        myData[3] = "Kizzy";
        myData[5] = "Jim";
        myData[6] = "Guillermo";
        myData[7] = "Loreta";
        myData[8] = "Shelby";
        myData[9] = "Julianne";


        // 5. Swap the values at index 5 and index 1
        myData[1] = "Jim";
        myData[5] = "Bobby";

        // 6. Print the array from beginning to end.
        for (int i = 0; i <= 9; i++){
            System.out.print(myData[i] + " " );
        }
        System.out.println();
        System.out.println(
                "=============================SHUFFLED============================");

        // 7. Shuffle the array of strings
        int index;
        String temp;
        Random random = new Random();
        for (int i = myData.length - 1; i >= 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = myData[index];
            myData[index] = myData[i];
            myData[i] = temp;

            System.out.print(myData[i] + " ");
        }

        System.out.println();
        System.out.println(
                "============================LONG/SHORT============================");

        // 8. Find and print the longest and shortest Strings in the array

        String longestString = " ";

        for (int i = 0; i < myData.length; i++){
            if (longestString.length() <= myData[i].length()){
                longestString = myData[i];
            }
        }
        System.out.print("Longest String: ");
        System.out.println(longestString);

        String shortestString = "   ";

        for (int j = 0; j < myData.length; j++ ){
            if (myData[j].length() <= shortestString.length()){
                shortestString = myData[j];
            }
        }
        System.out.print("Shortest String: ");
        System.out.println(shortestString);


        System.out.println("===========================TOTAL_COUNT============================");
        // 9. Add up the total number of characters in all of the strings in the array and print the answer
        int total = 0;
        int size = 0;
        for (int i = 0; i <= myData.length-1; i++){
            size = myData[i].length();
            total = total + size;
        }
        System.out.print("Total character count: ");
        System.out.println(total);


        System.out.println("===========================SEARCH============================");


        // 10. Prompt the user for a String and then perform a linear search of the array
        //  to see if that string is or is not in the array. Print if it is or is not found.

        String userInput;
        boolean isMatch = false;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a String: ");
        userInput = keyboard.nextLine();


        for (int i = 0; i < myData.length; i++){

            if (userInput.equals(myData[i])){
               isMatch = true;
            }
        }
        if (isMatch){
            System.out.print(userInput + " found!");
        }
        else {
            System.out.print(userInput + " not found!");
        }
        System.out.println();

        System.out.println("===========================ARRAY_SHIFT============================");

        // 11. Remove the item at index 4 of the array by shifting everything after it one spot to the left.
        // This means your array should have one empty index at the end after the shift (delete the duplicate item at the end).
        myData[4] = null;
        int removeIndex = 4;
        for (int i = removeIndex; i < myData.length-1; i++){
           myData[i] = myData[i + 1];
           System.out.print(myData[i] + " ");
        }
        System.out.println();
        myData[9] = null;

        for (int i = 0; i < myData.length-1; i++){
            System.out.print(myData[i] + " ");
        }
        System.out.println();

        System.out.println("===========================BIGGER_ARRAY============================");


        // 12. Create a new array that is twice as big as the current array and copy all of the items to the new array.
        // When complete, swap references so our old array gets garbage collected and the new array is pointed to by your array variable myData.

        String[] myBiggerData = new String[myData.length + 10];

        for (int i = 0; i < myData.length; i++){
            myBiggerData[i] = myData[i];
            //System.out.print(myBiggerData[i]+ " ");
        }
        //Test
        myBiggerData[18] = "Hi";
        for (int i = 0; i < myBiggerData.length; i++){
            System.out.print(myBiggerData[i] + " ");
        }
        System.out.println();
        System.out.println("===========================Strings============================");

        // 13. Prompt the user to enter 2 numbers within the range of the array's length. If the first is larger than the second print backwards from that index to the first.
        // If the second is larger than the first, print forward in the array from the first index to the second.
        int inputOne;
        int inputTwo;

        System.out.print("Please enter the first number: ");
        inputOne = keyboard.nextInt();

        for (int i = 1; i > 0; i++){
            if (inputOne > myBiggerData.length - 1){

                System.out.print("The number is out of range. Please enter the first number between 0-19: ");
                inputOne = keyboard.nextInt();
            }
        }

        System.out.print("Please enter the second number: ");
        inputTwo = keyboard.nextInt();

        for (int i = 1; i > 0; i++){
            if (inputTwo > myBiggerData.length - 1){

                System.out.print("The number is out of range. Please enter the second number between 0-19: ");
                inputTwo = keyboard.nextInt();
            }
        }
        System.out.println();

        if (inputOne > inputTwo){ //Print backward

            for (int i = inputOne; i > inputTwo - 1; i--){

                System.out.print(myBiggerData[i] + " ");
            }
        }

        if (inputOne < inputTwo){ //Print forward

            for (int i = inputOne; i <= inputTwo; i++){

                System.out.print(myBiggerData[i] + " ");
            }
        }
    }
}
