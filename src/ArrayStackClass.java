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
    public void push(T element){
    if (top== maxSize){
        throw new StackOverflowError();
    }
    else {
        items[top++] = (T) element;
    }
    }

    pop(){

    }

    peek(){

    }

    boolean empty(){
    if (items.length == 0){
        return False;
        }
    else {
        return True;
        }
    }

    size(){

    }

}
