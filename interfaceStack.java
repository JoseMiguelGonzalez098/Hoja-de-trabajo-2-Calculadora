/******************************************************************

@author Jose Miguel Gonzalez
Stack interface
******************************************************************/

/** 
* interface- determinates methodes and parameters
* 
*/

public interface interfaceStack<E> 
{
   /** 
   * post: item is added to stack
   * will be popped next if no intervening push
   * @return npne
   * @param E
   */
   public void push(E item);


   /** 
   * pre: stack is not empty
   * post: most recently pushed item is removed and returned
   * @return E
   * @param none
   */
   public E pop();


   /** 
   * pre: stack is not empty
   * post: top value (next to be popped) is returned
   * @return none
   * @param E
   */
   public E peek();


   /** 
   * post:  returns true if and only if the stack is empty
   * @return boolean
   * @param none
   */
   public boolean empty();

  
   /** 
   * post: returns the number of elements in the stack
   * @return int
   * @param none
   */
   public int size();

}