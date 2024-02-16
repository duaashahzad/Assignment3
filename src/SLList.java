public class SLList<T>
{
    SLNodeGenerics<T> head;
    public SLList()
    {
        head = null;
    }

    public void listAdd(T p)
    {
        SLNodeGenerics<T> newNode = new SLNodeGenerics<>(p);

        if(head == null) {
            head = newNode;
        }
        else
        {
            //insert new node next pointer to null
            newNode.next = null;

            //set last's node next to new node
            SLNodeGenerics<T> last = head;
            while(last.next != null)
            {
                last = last.next;
            }
            last.next = newNode; //new node becomes the last node
        }
    }

    public void listRemove(int pos)
    {
        if(head == null || pos < 0)
        {
            return;
        }

        if(pos == 0)
        {
            head = head.next;
            return;
        }

        SLNodeGenerics<T> temp = head;

        for(int i = 0; temp != null && i < pos - 1; i++)
        {
            temp = temp.next;
        }

        if(temp.next != null){
            temp.next = temp.next.next;
        }

    }

    public String toString()
    {
        String result = "";
        SLNodeGenerics<T> current = head;

        while(current != null)
        {
            result += current.data.toString() + "\n";
            current = current.next;
        }

        return result;

    }
}
