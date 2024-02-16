public class SLNodeGenerics<T>
{
    T data;
    SLNodeGenerics<T> next;

    public SLNodeGenerics(T v)
    {
        this.data = v;
        this.next = null;
    }
}