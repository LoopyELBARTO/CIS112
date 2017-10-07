package Week4;
import ch02.stacks.*;
import support.LLNode;

public class LinkedStack47<T> extends LinkedStack<T> {
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
               top = top.getLink();
           }
       }

    }

    public boolean swapStart(){
        LLNode<T> availableNodes = top;
        LLNode<T> temp;
        LLNode<T> temp2;
        LLNode<T> temp3;
        LLNode<T> FirstNode = top;
        LLNode<T> SecondNode = top;
        if (Size()< 2){
            return false;
        }
        else {
           /*topNode += availableNodes.getInfo().toString();
           temp = topNode;
           top.getLink();
           availableNodes = availableNodes.getLink();
           underTopNode += availableNodes.getInfo().toString();
           temp2 = underTopNode;
           top = top.getLink();*/
           /*temp = top;
           top = top.getLink();
           SecondNode = temp;
           temp = top;
           top = top.getLink();
           FirstNode = temp;
           temp = top;
           top = top.getLink();
           ThirdNode = temp;

           temp.setLink(SecondNode);
           temp.setLink(FirstNode);
           temp.setLink(ThirdNode);*/

          /* temp = FirstNode;
           FirstNode = temp.getLink();
           temp2 = SecondNode;
           SecondNode = temp2.getLink();
           FirstNode = temp;
           temp.setLink(FirstNode);
           SecondNode = temp2;
           temp2.setLink(SecondNode);
           temp2.setLink();*/



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
        LinkedStack47 LS48 = new LinkedStack47();

        LS48.push("Bob ");
        LS48.push("Kid ");
        LS48.push("Chick ");
        LS48.push("Mike ");
        LS48.push("Bike ");
        LS48.push("Lam ");
        LS48.push("Kim ");


        System.out.println(LS48.toString());
        System.out.println(LS48.Size());
        LS48.popSome(3);

        System.out.println(LS48.toString());
        LS48.swapStart();
        System.out.println("------SWAP------");
        System.out.println(LS48.toString());

        System.out.println("------popTop------");
        LS48.poptop();
        System.out.println(LS48.toString());

    }
}