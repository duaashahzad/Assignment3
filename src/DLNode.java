public class DLNode
{
    Book data;
    DLNode previous;
    DLNode next;

    public DLNode(Book v){
        data = v;
        previous = null;
        next = null;
    }

}
