//---------------------------------------------------------------------------
// CircularLinkedQueue.java            by Dale/Joyce/Weems                  Chapter 4
//
// Implements QueueInterface using a linked list.
//---------------------------------------------------------------------------

package Week6;

import ch04.queues.QueueInterface;
import ch04.queues.QueueUnderflowException;
import support.LLNode;

public class CircularLinkedQueue<T> implements QueueInterface<T>
{
  protected LLNode<T> front;     // reference to the front of this queue
  protected LLNode<T> rear;      // reference to the rear of this queue
  protected int numElements = 0; // number of elements in this queue

  public CircularLinkedQueue()
  {
    front = null;
    rear = null;
  }

  public void enqueue(T element)
  // Adds element to the rear of this queue.
  { 
    LLNode<T> newNode = new LLNode<T>(element);
    if (rear == null)
      front = newNode;
    else
      if (rear.getLink() == null){
      rear.setLink(newNode);
      newNode.setLink(rear);
      }
      else {
        newNode.setLink(rear.getLink());
        rear.setLink(newNode);
      }
    rear = newNode;
    numElements++;
  }     

  public T dequeue()
  // Throws QueueUnderflowException if this queue is empty;
  // otherwise, removes front element from this queue and returns it.
  {
    if (isEmpty())
      throw new QueueUnderflowException("Dequeue attempted on empty queue.");
    else
    {
      T element;
      rear = rear.getLink();
      element = rear.getInfo();

      if (rear.getLink() == null){
          rear = null;
      }
      return element;
    }
  }

  public boolean isEmpty()
  // Returns true if this queue is empty; otherwise, returns false.
  {
      if (rear == null){
          return true;
      }
      else return false;
  }
  
  public boolean isFull()
  // Returns false - a linked queue is never full.
  {              
    return false;
  }

  public int size()
  // Returns the number of elements in this queue.
  {
    return numElements;
  }

}

