package DataStructures.LinearDS;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StaticStack {

    int [] data;
    int top;

    public StaticStack(){

        data = new int[10];
        top = -1;
    }

    public boolean isEmpty(){

        return top == -1;
    }

    public void push(int x){

        top++;

        if (top == data.length){

            resizeData();
        }
        data[top] = x;
    }

    public int pop(){

        if (!isEmpty()) {

            return data[top--];
        }
        throw  new EmptyStackException();
    }

    public int peek(){

        if (!isEmpty()) {

            return data[top];
        }
        throw  new EmptyStackException();
    }

    public void resizeData(){

        data = Arrays.copyOf(data, data.length * 2);
    }
}
