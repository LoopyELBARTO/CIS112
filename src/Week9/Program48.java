package Week9;

import ch07.trees.BinarySearchTree;
import support.BSTNode;

import java.util.ArrayList;
import java.util.Random;

public class Program48<C> extends BinarySearchTree {

    public int randomNumbers;

    public int height(BSTNode<Character> Node){
        if (Node == null){
            return -1;
        }
        int leftHeight = height(Node.getLeft());
        int rightHeight = height(Node.getRight());

        if (leftHeight > rightHeight){
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }

    }
    public double fRatio(BSTNode<Character> Node){
        return 3.0/height(Node);
    }

    public int generateRandomNumbers(int min, int max){
        Random random = new Random();

        return randomNumbers = random.nextInt((max-min)+1)+min;
    }

    public static void main(String[] args) {
        Program48<Character> p48Char = new Program48<>();
        p48Char.add('P');
        p48Char.add('F');
        p48Char.add('S');
        p48Char.add('B');
        p48Char.add('H');
        p48Char.add('R');
        p48Char.add('Y');
        p48Char.add('G');
        p48Char.add('T');
        p48Char.add('Z');
        p48Char.add('W');
        p48Char.add('Q');
        p48Char.add('X');

        System.out.println("Program 48a");
        System.out.println("------------------");
        System.out.println("Height");
        System.out.println(p48Char.height(p48Char.root) + "\n");

        System.out.println("Fullness Ratio");
        System.out.println(p48Char.fRatio(p48Char.root));

        System.out.println("-----------------");
        System.out.println("Program 48b, 48c");
        System.out.println("-----------------");

        Program48<Integer> p48Int = new Program48<>();
        int numTrees = 10;
        ArrayList<Program48<Integer>> treeArray = new ArrayList<>(numTrees);

        int randomNums =1;

        for(int h = 1 ; h < numTrees+1 ; h++) {
            Program48<Integer> temp = new Program48<>();
            for (int i = 1; i < 1000; i++) {
                randomNums = temp.generateRandomNumbers(1, 3000);
                temp.add(randomNums);
            }
            System.out.println("Height of tree " + h + ": " + temp.height(temp.root));
            System.out.println("Fullness Ratio: " + temp.fRatio(temp.root) + "\n");
            treeArray.add(temp);
        }
        System.out.println("-----------------");
        System.out.println("Program 49");
        System.out.println("-----------------");

        int K = 20;
        for (int tree = 1; tree < numTrees+1; tree++){
            Program48<Integer> temp = new Program48<>();
            for (int i = 1; i < 1000; i++){
                if (randomNums == K) {
                    randomNums = temp.generateRandomNumbers(1, 3000);
                    temp.add(randomNums);
                }
            }
            treeArray.add(temp);
        }
    }
}
