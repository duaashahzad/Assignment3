public class AList<T> {
    private static final int INITIAL_CAPACITY = 10;

    private int size;
    private Object[] array;

    public AList() {
        array = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void listAdd(T p) {
        if (size == array.length) {
            int newMaxSize = array.length * 2;
            Object[] newArray = new Object[newMaxSize];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }

        array[size++] = p;
    }

    public void listRemove(int pos) {
        if (pos >= 0 && pos < size) {
            for (int i = pos; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        } else {
            System.out.println("Error");
        }
    }

    public String toString() {
        if (size == 0) {
            return "Empty List";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append(array[i].toString()).append("\n");
        }

        return result.toString();
    }
}