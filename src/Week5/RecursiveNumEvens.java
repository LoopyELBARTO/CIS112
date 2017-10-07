package Week5;

import ch02.stacks.LinkedStack;
import support.LLNode;

import java.lang.reflect.Array;

public class RecursiveNumEvens<T> extends LinkedStack<T> {
    public String toString(){
        String temp = "";
        LLNode<T> currentNode = top;
        while (currentNode != null){
            temp =  temp + currentNode.getInfo().toString();
            currentNode = currentNode.getLink();
        }
        return temp;
    }
    int count = 0;
    public int numEvens(LLNode<Integer> list){
        int temp = 0;

        while (list != null){
            temp =+ list.getInfo();
            if ((temp) % 2 == 0){
                count++;
                numEvens(list.getLink());
                return count;
            }
            else { 
                return numEvens(list.getLink());
            }
        }
        return count;
    }

    public static void main(String[] args){
        RecursiveNumEvens<Integer> r = new RecursiveNumEvens<Integer>();
        r.push(2);
        r.push(4);
        r.push(2);
        r.push(6);
        r.push(5);
        r.push(5);
        r.push(6);
        r.push(7);
        r.push(10);

        System.out.println(r.toString() + " ");
        LLNode<Integer> list = r.top;
        System.out.println(r.numEvens(list));
    }
}


