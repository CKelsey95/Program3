/* Colton Kelsey
   CS 2050 Program 3
*/
import java.util.EmptyStackException;

public class ArrayStackClass<T> {
    private T[] items;  // general parameter for array
    int top;    // current top number
    int maxSize;  // max size of the stack

    public ArrayStackClass(int N){        // constructor for ArrayStack
        maxSize = N;                      // sets initial max size
        items = (T[]) new Object[maxSize];      //creates instance of array, sets size to maxSize variable
        top = 0;                                 // sets top number to 0
    }
    public void push(T element){              // method to add to the top of the stack
    if (top == maxSize){
        throw new StackOverflowError();       // throws error if we go over maxSize
    }
    else {
        items[top++] = (T) element;          // adds to the top of the stack
    }
    }

    public T pop(){
    if(empty()){
        throw new EmptyStackException();
    } else {
        return items[--top];
        }
    }

    public T peek(){
    if(empty()){
        throw new EmptyStackException();
    } else {
        return items[top -1];
    }
    }


    boolean empty(){          // checks for empty stack
        if (items.length == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public int size(){
    return top;
    }

}
