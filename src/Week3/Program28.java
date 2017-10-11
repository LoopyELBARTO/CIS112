package Week3;

import ch02.stacks.ArrayBoundedStack;

public class Program28 <T> extends ArrayBoundedStack<T> {

    public String toString(){
        return String.valueOf(elements.length - Size());
    }

    public int Size(){
      return topIndex + 1;
    }

    public void popSome(int count){
     if (isEmpty())
      System.out.println("underflow");
    else
    {
      elements[topIndex] = null;
      topIndex = topIndex - count;
      }
    }

    /*public T popTop(){

    }*/
    public static void main(String[] args){
        Program28<String> myStack = new Program28<>();
        myStack.push("Hi");
        myStack.push("Bye");
        myStack.push("Late");
        myStack.push("Mom");
        myStack.popSome(2);
        System.out.println(myStack.toString());
        System.out.println(myStack.Size());
    }
}
