
import java.util.ArrayList;

public class ArrayBag<T> implements Bag<T> {
    private ArrayList<T> bagContents = new ArrayList<>();

    @Override
    public void add(T item) throws UnsupportedOperationException{
        bagContents.add(item);
    }

    @Override
    public T remove(T item) {

        if (!bagContents.contains(item)){
            System.out.println("The " + item +" isn't inside the bag");
//            System.out.println("null");
            return null;
        } else {
            bagContents.remove(item);
            System.out.println("The " + item +" is removed inside the bag");

            return item;
        }




    }

    @Override
    public void removeAll() {
        bagContents.clear();
    }

    @Override
    public String toString() {

        if(bagContents.isEmpty()){
            System.out.println("The bag is empty. Please add something to the bag ");
        } else {
            return "This is a bag!  Its contents are: .... " + bagContents;

        }

        return null;
    }
}
