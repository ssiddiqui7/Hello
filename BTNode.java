public class BTNode<E>
  {
    protected E element;
    protected BTNode<E> left;
    protected BTNode<E> right;
    protected BTNode<E> parent;
    
    
    public BTNode()
    {
        element=null;
        left=null;
        right=null;
        parent=null;
    }
    public BTNode(E val, BTNode<E> l, BTNode<E> r, BTNode<E> p) {
        
        
        element=val;
        left=l;
        right=r;
        parent=p;
    }
    
  } // class Entry