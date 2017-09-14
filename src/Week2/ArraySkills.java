package Week2;

import java.util.Random;

public class ArraySkills {
    public static void main(String[] args) {

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

        // 7. Shuffle the array of strings
        Random rand = new Random();
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

        // 8. Find and print the longest and shortest Strings in the array

        int stringIndex;
        String temp2;

        for (int i = 0; i == myData.length - 1; i++){
            stringIndex = i;
            temp2 = myData[stringIndex];
            myData[stringIndex] = myData[i];
            //myData[i] = temp2;

            System.out.println(myData[i]);
        }

        // 9. Add up the total number of characters in all of the strings in the array and print the answer

        // 10. Prompt the user for a String and then perform a linear search of the array
        //  to see if that string is or is not in the array. Print if it is or is not found.

        // 11. Remove the item at index 4 of the array by shifting everything after it one spot to the left.
        // This means your array should have one empty index at the end after the shift (delete the duplicate item at the end).

        // 12. Create a new array that is twice as big as the current array and copy all of the items to the new array.
        // When complete, swap references so our old array gets garbage collected and the new array is pointed to by your array variable myData.

        // 13. Prompt the user to enter 2 numbers within the range of the array's length. If the first is larger than the second print backwards from that index to the first.
        // If the second is larger than the first, print forward in the array from the first index to the second.
    }
}
