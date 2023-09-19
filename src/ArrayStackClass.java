/* Colton Kelsey
   CS 2050 Program 3
*/
import java.util.EmptyStackException;

public class ArrayStackClass<T> {
    private T[] items;  // general parameter for array
    int top;    // current amount stored in the stack
    int maxSize;  // max size of the stack

    public ArrayStackClass(int N){
        maxSize = N;
        items = (T[]) new Object[maxSize];
        top = 0;
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
