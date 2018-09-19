package DataStructures.LinearDS;

import java.util.EmptyStackException;

public class DinamicStack {

    private Node top;

    public DinamicStack(){

        top = null;
    }

    public boolean isEmpty(){

        return top.equals(null);
    }

    public void push(int x){

        Node nextElement = new Node(x); //creates new element with the desired value

        nextElement.previous = top;     //creates a link between the new and the current element(top),
                                        //pushing the current element down

        top = nextElement;              //the new element becomes current(top)
    }

    public int pop(){

        if (!isEmpty()) {

            int result = top.value;
            top = top.previous;
            return result;
        }
        throw  new EmptyStackException();
    }

    public int peek(){

        if (!isEmpty()) {

            return top.value;
        }
        throw  new EmptyStackException();
    }
}
