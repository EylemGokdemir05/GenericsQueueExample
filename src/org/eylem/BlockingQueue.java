package org.eylem;

public class BlockingQueue<T> implements Queue<T> {

    private Node<T> first;
    private Node<T> last;

    @Override
    public void add(T value) {
        Node<T> node=new Node<T>(value);
        if (first==null){
            first=node;
            last=node;
        }else {
            last.setNextNode(node);
            last=node;
        }
    }

    @Override
    public T poll() {
        T value=null;
        if (first!=null){
            Node<T> node=first;
            first=first.getNextNode();
            value= node.getValue();
        }
        return value;
    }

    @Override
    public T peek() {
        return first!=null ? first.getValue() : null;
    }
}
