import java.util.List;

public class Node extends ListItem {

    public Node(String value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.nextValue;
    }

    @Override
    ListItem setNext(ListItem item) {
         this.nextValue = item;
         return this.nextValue;
    }

    @Override
    ListItem previous() {
        return this.previousValue;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.previousValue=item;
        return this.previousValue;
    }

    @Override
    int compareTo(ListItem anotherItem) {
        if (anotherItem!= null) {


         return   (this.getValue()).toString().compareTo(anotherItem.getValue().toString());
    //        return ((String) this.getValue()).compareTo((String) anotherItem.getValue());
        }

        return -1;
    }


}
