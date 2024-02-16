public class SLNode<T> {
    public Book data;
    SLNode next;

    public SLNode(Book v)
    {
        this.data = v;
        this.next = null;
    }
}