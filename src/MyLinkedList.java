import java.util.Scanner;

public class MyLinkedList implements NodeList {
    public static Scanner scanner = new Scanner(System.in);
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }
        if (item == null) {
            System.out.println("You can not add null to the list");
            return false;
        }

        ListItem currentItem = this.root;
        int comparison;
        while (currentItem != null) {
            comparison = currentItem.compareTo(item);

            if (comparison == 0) {
                System.out.println("You already have " + item.getValue() + " this value in the list. Nothing was added");
                return false;
            } else if (comparison < 0) {
                //new item is greater, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, so insert at the end of the list
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison>0) {
                //new item is less, so insert it previous
                if (currentItem.previous()!=null){

                    currentItem.previous().setNext(item);
                    item.setPrevious(currentItem.previous());
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);
                return true;


                } else {
                    // there is no previous, so insert at the start of the list
                    item.setNext(this.root);
                    this.root.setPrevious(item);
                    this.root=item;
                    return true;


                }
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
if (item==null || this.root==null){
    return false;
}

    if (item.previous() != null && item.next() != null) {
        item.previous().setNext(item.next());
        item.next().setPrevious(item.previous());
    } else if (item.previous() == null && item.next() != null) {
        this.root = item.next();
        item.next().setPrevious(this.root);
    } else if (this.root==item) {
        this.root = root.next();
    } else if (item.previous() != null && item.next() == null) {
        item.previous().setNext(null);
    }


return true;
    }

    @Override
    public void traverse(ListItem root) {
        if  (getRoot()==null) {
            System.out.println("You do not have values in your list");
            return;
        }
        ListItem currentItem=root;
        System.out.println(currentItem.getValue().toString());
        while (currentItem.next()!=null){
            currentItem=currentItem.next();
            System.out.println(currentItem.getValue().toString());
        }

    }

}
