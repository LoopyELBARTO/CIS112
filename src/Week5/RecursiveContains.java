package Week5;

import support.LLNode;

public class RecursiveContains<T> extends RecursiveNumEvens<T> {

    int target = 0;
    String containValue = "The target is in the List";
    public boolean contains(int target, LLNode<Integer> list){
        int listOfNumbers = 0;
        while (list != null){
            listOfNumbers =+ list.getInfo();
            if (listOfNumbers == target){
                return true;
            }
            else {
                return contains(target,list.getLink());
            }
        }
        return false;
    }


    public static void main(String[] args){
        RecursiveContains<Integer> r = new RecursiveContains<Integer>();

        r.push(1);
        r.push(2);
        r.push(3);
        r.push(4);

        System.out.println(r.toString());
        LLNode<Integer> list = r.top;
        System.out.println(r.contains(2,list));
    }
}
