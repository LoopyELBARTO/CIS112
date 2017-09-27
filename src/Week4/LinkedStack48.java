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
        LLNode<T> nodeToPop = top;
        String temp = "";
       if (isEmpty()) {
           throw new StackUnderflowException("Popped Empty stack");
       }
       else {
           for (int i = 0; i < count; i++){
               temp += nodeToPop.getInfo().toString();
               nodeToPop = nodeToPop.getLink();
               pop();
           }
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
        LS48.popSome(5);
        /*LS48.pop();
        LS48.pop();
        LS48.pop();*/
        System.out.println(LS48.toString());
    }
}