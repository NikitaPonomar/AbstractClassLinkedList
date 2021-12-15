public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(null);
        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");
        for (String s : data) {
            //System.out.println(s);
           myLinkedList.addItem(new Node(s));
        }

        System.out.println("Your root is  "+ myLinkedList.getRoot().getValue().toString());

        System.out.println("Lets traverse");
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("Your root is  "+ myLinkedList.getRoot().getValue().toString());
        System.out.println("Remove root.next()");
        myLinkedList.removeItem(myLinkedList.getRoot().next());


        System.out.println("Lets traverse");
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("Your root is  "+ myLinkedList.getRoot().getValue().toString());
        System.out.println("Remove root.next()");
        myLinkedList.removeItem(myLinkedList.getRoot().next());

        System.out.println("Lets traverse");
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("Your root is  "+ myLinkedList.getRoot().getValue().toString());
        System.out.println("Remove root.next()");
        myLinkedList.removeItem(myLinkedList.getRoot().next());

        System.out.println("Lets traverse");
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("Your root is  "+ myLinkedList.getRoot().getValue().toString());
        System.out.println("Remove root");
        myLinkedList.removeItem(myLinkedList.getRoot());


        System.out.println("Lets traverse");
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("Your root is  "+ myLinkedList.getRoot().getValue().toString());
        System.out.println("Remove root.next()");
        myLinkedList.removeItem(myLinkedList.getRoot().next());


        System.out.println("Lets traverse");
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("Your root is  "+ myLinkedList.getRoot().getValue().toString());
        System.out.println("Remove root.next()");
        myLinkedList.removeItem(myLinkedList.getRoot().next());
        System.out.println("Lets traverse");
        myLinkedList.traverse(myLinkedList.getRoot());

        System.out.println("Your root is  "+ myLinkedList.getRoot().getValue().toString());
        System.out.println("Remove root");
        myLinkedList.removeItem(myLinkedList.getRoot());
        System.out.println("Lets traverse");
        myLinkedList.traverse(myLinkedList.getRoot());

    }
}
