package Week4;
import ch02.stacks.*;
import support.LLNode;

public class LinkedStack48<T> extends LinkedStack<T> {
    public String toString(){
        String temp = "";
        LLNode<T> currentNode = top;
        while (currentNode != null){
            temp += currentNode.getInfo().toString();
            currentNode = currentNode.getLink();
        }
        return temp;
    }

    public int Size(){
        int count = 0;
        LLNode<T> nodes = top;
        while (nodes != null){
            nodes = nodes.getLink();
            count++;
        }
        return count;
    }

    public void popSome(int count){
       if (isEmpty()) {
           throw new StackUnderflowException("Popped Empty stack");
       }
       else {
           for (int i = 0; i < count; i++){
               pop();
           }
       }

    }

    public boolean swapStart(){
        LLNode<T> availableNodes = top;
        String temp = "";
        String temp2 = "";
        String topNode = "";
        String underTopNode = "";
        if (Size()< 2){
            return false;
        }
        else {
           topNode += availableNodes.getInfo().toString();
           temp = topNode;
           pop();
           availableNodes = availableNodes.getLink();
           underTopNode += availableNodes.getInfo().toString();
           temp2 = underTopNode;
           pop();

           push((T) temp);
           push((T) temp2);


        }
        return true;
    }

    public void poptop(){
        LLNode<T> nodes = top;
        String temp = "";
        String topNode = "";
        if (isEmpty()){
            throw new StackUnderflowException("Empty stack");
        }
        else {
            topNode += nodes.getInfo().toString();
            temp = topNode;
            pop();
            push((T) temp);
        }
    }



    public static void main(String[] args){
        LinkedStack48 LS48 = new LinkedStack48();

        LS48.push("Bob ");
        LS48.push("Kid ");
        LS48.push("Chick ");
        LS48.push("Mike ");
        LS48.push("Bike ");
        LS48.push("Lam ");
        LS48.push("Kim ");


        System.out.println(LS48.toString());
        System.out.println(LS48.Size());
        LS48.popSome(1);

        System.out.println(LS48.toString());
        LS48.swapStart();
        System.out.println("------SWAP------");
        System.out.println(LS48.toString());

        System.out.println("------popTop------");
        LS48.poptop();
        System.out.println(LS48.toString());

    }
}