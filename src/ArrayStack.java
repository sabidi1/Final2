import java.util.EmptyStackException;
/**
An interface for the ADT stack. @author Syed Abidi
*/
public class ArrayStack <T> implements StackInterface<T> {
private T[] stack;
private int size;
public int stackTop;
private static final int INTIAL_SIZE = 10;
@SuppressWarnings("unchecked") public void StackInterface(T IntialSize) {
stack = (T[ ])new Object[INTIAL_SIZE]; size = 0;
}
/** Adds a new entry to the top of this stack.
@param newEntry An object to be added to the stack. */
public void push(T newEntry) { if(size == stack.length) {
throw new EmptyStackException(); }
stack [stackTop] = newEntry; size++;
}
/** Removes and returns this stack's top entry.
@return The object at the top of the stack.
@throws EmptyStackException if the stack is empty before the operation. */
public T pop() { T top= null;
if (size == 0){
throw new EmptyStackException(); }
top = stack[stackTop-1]; stackTop--;
return top; }
/** Retrieves this stack's top entry.
@return The object at the top of the stack.
@throws EmptyStackException if the stack is empty. */
public T peek() {
T top = null;
if(!isEmpty()) { //if stack is not empty top = stack [stackTop];
}
return top;
}
/** Detects whether this stack is empty.
/** Detects whether this stack is empty. @return True if the stack is empty. */
public boolean isEmpty() { if(size == 0) {
return true;
}
else { return false; }
}

/** Removes all entries from this stack. */
public void clear() {
stack = null;
}
}