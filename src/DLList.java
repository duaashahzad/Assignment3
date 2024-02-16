public class DLList<T>
{

    DLNodeGenerics<T> head;

    public DLList()
    {
        head = null;
    }

    public void listAdd(T p)
    {

        DLNodeGenerics<T> newNode = new DLNodeGenerics<>(p);

        if(head == null) {
            head = newNode;
        }
        else
        {
            DLNodeGenerics<T> tail = head;

            while(tail.next != null)
            {
                tail = tail.next;
            }
            tail.next = newNode; //new node becomes the last node
            newNode.previous = tail;
        }
    }

    public void listRemove(int pos)
    {
        if(head == null || pos < 0)
        {
            return;
        }

        DLNodeGenerics<T> current = head;

        for(int i = 0; current != null && i < pos; i++)
        {
            current = current.next;
        }

        if(current == null)
        {
            return;
        }

        if(current.previous != null){
            current.previous.next = current.next;
        }
        else {
            head = current.next;
        }

        if(current.next != null){
            current.next.previous = current.previous;
        }
    }

    public String toString()
    {
        String result = "";
        DLNodeGenerics<T> current = head;

        while(current != null)
        {
            result += current.data.toString() + "\n";
            current = current.next;
        }

        return result;
    }
}
