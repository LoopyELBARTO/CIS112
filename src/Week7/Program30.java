package Week7;

import ch05.collections.LinkedCollection;
import support.LLNode;

public class Program30<T> extends LinkedCollection<T> {
    public String toString(){
        String temp = "";
        LLNode<T> nodes = head;
        while (nodes != null){
            temp +=  nodes.getInfo().toString() + " ";
            nodes = nodes.getLink();
        }
        return temp;
    }

    public int count(T target){
        LLNode<T> currentNode = head;
        int count = 0;
            while (currentNode != null){
                if (currentNode.getInfo().equals(target)){
                    count++;
                    currentNode = currentNode.getLink();
                }
                else {
                    currentNode = currentNode.getLink();
                }
        }
        return count;
    }

    public void removeAll(T target){
        LLNode<T> currentNode = head;
            while (currentNode != null){
                find(target);
                if (found){
                    if (head == location){
                        head = head.getLink();
                    }
                    else {
                        previous.setLink(location.getLink());
                    }
                    numElements--;
                }
                else {
                    currentNode = currentNode.getLink();
                }
            }
    }
    public Program30<T> combine (Program30<T> other){
        LLNode<T> currentNode = head;
        previous.setLink(other);
        return other;
    }

    public static void main(String[] args){
        Program30<Integer> p30 = new Program30<>();
        p30.add(1);
        p30.add(2);
        p30.add(3);
        p30.add(4);
        p30.add(4);
        p30.add(4);
        p30.add(5);

        System.out.println(p30);
        System.out.println(p30.count(4));
        p30.removeAll(4);
        System.out.println(p30);

        Program30<Integer> p30b = new Program30<>();
        p30b.add(6);
        p30b.add(7);
        p30b.add(8);
        p30b.add(9);
        p30b.add(10);

        System.out.println(p30b);

        p30.combine(p30b);

        System.out.println(p30);

    }
}
