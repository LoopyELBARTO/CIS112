package Week6;

import ch04.queues.LinkedQueue;
import ch04.queues.QueueUnderflowException;
import support.LLNode;

public class LinkedQueueHW<T> extends LinkedQueue {

    public String toString(){
        String temp = "";
        LLNode<T> nodes = front;
        while (nodes != null){
            temp +=  nodes.getInfo().toString() + " ";
            nodes = nodes.getLink();
        }
        return temp;
    }
    public void remove(int count){
        if (isEmpty()){
            throw new QueueUnderflowException("Dequeue attempted on empty queue.");
        }
        else {
            for (int i = 0; i < count; i++){
                front = front.getLink();
                numElements = numElements - count;
            }
        }
    }

    public boolean swapStart(){
        LLNode<T> temp;
        LLNode<T> temp2;
        LLNode<T> firstNode;
        LLNode<T> secondNode;



        if (size() < 2){
            return false;
        }

        else {
            temp = front;
            front = front.getLink();
            secondNode = temp;
            temp2 = front;
            front = front.getLink();
            firstNode = temp2;
            secondNode.setLink(front);
            front = secondNode;
            firstNode.setLink(front);
            front = firstNode;
        }
        return true;
    }

    public boolean swapEnd(){
        LLNode<T> temp;
        LLNode<T> temp2;
        LLNode<T> temp3;

        LLNode<T> newFirstNode;
        LLNode<T> newSecondNode;
        LLNode<T> newThirdNode;



        if (size() < 2){
            return false;
        }

        else {
            /*temp = front;
            front = front.getLink();
            firstNode = temp;
            enqueue(temp.toString());*/
            temp = front;
            temp2 = rear;
            while (front != temp2){
                front = front.getLink();
                if (front.equals(temp2)){
                    newFirstNode = temp2;
                    newFirstNode.setLink(temp.getLink());
                    newSecondNode = temp;
                    newFirstNode.setLink(newSecondNode);
                }
            }
        }
        return true;
    }


    public static void main(String[] args){
        LinkedQueueHW<Integer> lq = new LinkedQueueHW<Integer>();

        lq.enqueue(1);
        lq.enqueue(2);
        lq.enqueue(3);
        lq.enqueue(4);
        lq.enqueue(5);

        lq.remove(1);

        System.out.println(lq.toString());

        lq.swapStart();

        System.out.println(lq.toString());

        lq.swapEnd();

        System.out.println(lq.toString());


    }
}
