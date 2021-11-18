package cacpter1_3.common;

import java.util.Iterator;

public class LinkedStack <T>implements Stack<T>{
    protected Node<T>last;
    protected int size;
    public LinkedStack(T t) {
        last=new Node<>(t);
    }

    public LinkedStack() {
    }

    @Override
    public void push(T t) {
        size++;
        if(last==null){
            last=new Node<>(t);
            return;
        }
        Node<T> node=new Node<>(last,t);
        last.next=node;
        last=node;
    }

    @Override
    public T pop() {
        if(last==null){
            return null;
        }
        Node<T>pre=last.pre;
        if(pre!=null){
            pre.next=null;
        }
        last.pre=null;
        T t=last.t;
        last=pre;
        size--;
        return t;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        if(size==0){
            return new IteratorArray<>(new Object[0]);
        }

        Object []array=new Object[size];
        Node current=last;
        for (int i = size; i > 0; i--) {
            array[size-1]=current;
            current=current.pre;
        }
        return new IteratorArray<>(array);
    }
}
