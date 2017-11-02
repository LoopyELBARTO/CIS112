package Week9;

import ch04.queues.LinkedQueue;
import ch07.trees.BinarySearchTree;
import support.BSTNode;

import java.util.Iterator;

public class Program32<T> extends BinarySearchTree {
    Iterator<Character> iter;


    //along the recSize() int BST
    public int height(BSTNode<Character> Node){
        if (Node == null){
            return 0;
        }
        int leftHeight = height(Node.getLeft());
        int rightHeight = height(Node.getRight());

        if (leftHeight > rightHeight){
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }

    }
    public int heightIter(BSTNode<Character> Node){
        LinkedQueue<BSTNode<T>> q = new LinkedQueue<BSTNode<T>>();
        int height =0;
        if (root !=null){
            q.enqueue(root);
        }
        while (!q.isEmpty()){
            height++;
            LinkedQueue<BSTNode<T>> q2 = new LinkedQueue<BSTNode<T>>();

            while (!q.isEmpty()){
                BSTNode<T> parent = q.dequeue();
                if (parent.getRight() != null){
                    q2.enqueue(parent.getRight());
                }
                if (parent.getLeft() != null){
                    q2.enqueue(parent.getLeft());
                }
            }
            q = q2;
        }
        return height;
    }

    public static void main(String[] args){
        Program32<Character> p32 = new Program32<>();
        p32.add('P');
        p32.add('F');
        p32.add('S');
        p32.add('B');
        p32.add('H');
        p32.add('R');
        p32.add('Y');
        p32.add('G');
        p32.add('T');
        p32.add('Z');
        p32.add('W');

        //p32.height(p32.root.getLeft());
        System.out.println("Recursively");
        System.out.println(p32.height(p32.root)+ "\n");

        System.out.println("Iterartivly");
        System.out.println(p32.heightIter(p32.root));
    }
}
