public abstract class ListItem {
    protected Object  value;
    protected ListItem nextValue = null;
    protected ListItem previousValue = null;


    public ListItem(Object value) {
        this.value = value;
       System.out.println(value);
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem anotherItem);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}
