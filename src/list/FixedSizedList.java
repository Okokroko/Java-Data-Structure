package list;
public class FixedSizedList <E>{
    //Generic array
    private E [] data;

    //constructor
    public static final int CAPACITY =7;

    //Variable to update size
    private int size =0;

    //Constructors to update list
    public FixedSizedList() {
        this (CAPACITY);
    }

    public FixedSizedList(int desiredSize){
        data = (E[]) new Object[desiredSize];
    }

    //Method to check the index
    public void checkIndex(int i,int n){
        if(i<0||i>=n)
            throw new IndexOutOfBoundsException("Illegal Index: "+i);
    }

    //Method to add
    public void add(int i, E e) {
        checkIndex(i, size+1);
        if(size == data.length)
            throw new IllegalStateException("List is Full");

        for(int k=size-1; k>=i; k--) {
            data[k + 1] = data[k];
                }
        data[i] = e;
        size++;
    }

    //Method to add to specific index
    public void add(E e) {
        int i= size;
        add(i,e);
    }

    //Method to add to take care of gap
    public void addIfGap(int i, E e){
        checkIndex(i, size+1);
        if(size == data.length)
            throw new IllegalStateException("List is Full");

        for(int j =size; j > i; j--) {
            data[j] = data[j -1];
            data[i] =e;
            size++;
        }
        return;

    }

    //Method to remove at index i
    public E remove(int i) {
        checkIndex(i, size+1);
        E temp = data[i];
        for(int k=1; k<size-1; k++) {
            data[k] =data[k+1];
        }
        data[size-1]= null;
        size--;

        return temp;
    }

    //Method to return the size
    public int size() {
        return size;
    }

    //Method to check if list is empty
    public boolean isEmpty() {
        return size==0;
    }

    //Method to get element at an index
    public E get(int i) throws IndexOutOfBoundsException{
        checkIndex(i, size);
        return data[i];
    }

    //Method to replace at an index and return
    public E set(int i, E e) throws IndexOutOfBoundsException{
        checkIndex(i, size);

        E temp = data[i];
        data[i] = e;
        return temp;
    }

    //Method to check if an index contain an element
    public boolean contains(Object item) {
        for(int j=0; j<size-1; j++) {
            if(get(j).equals(item)) {
            return true;
            }
        }
        return false;
    }


    //Method to swap two element at an index
    public E swap(int i, int j) throws IndexOutOfBoundsException{
        checkIndex(i, size);
        checkIndex(j, size);

        E temp = data[i];
        data[i] = data[j];
        data[j] = temp;
        return data[i];
    }

    //Method to count words of an index
    public int countWordsAtIndex(int i) {
        checkIndex(i, size);
        String element= String.valueOf(data[i]);
        String[] words =element.split("\\s+");
        return words.length;
    }

    //Method to add at an index to make it add to an existing space


}
