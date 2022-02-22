
public interface Bag <T>{
    /*
    @returns nothing
    @params item is thing to be added to bag
     */
    public void add(T item) throws UnsupportedOperationException;

    /*
    @params item is the thing to remove
     */
    public T remove(T item);

    /*

     */
    public void removeAll();
}
