public class DLNodeGenerics<T>
{
    T data;
    DLNodeGenerics<T> previous;
    DLNodeGenerics<T> next;

    public DLNodeGenerics(T v){
        data = v;
        previous = null;
        next = null;
    }
}
