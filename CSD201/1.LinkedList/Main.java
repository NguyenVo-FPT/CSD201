
public class Main {

    public static void main(String[] args) {
        MyList mylist = new MyList();
        mylist.addFirst(10);
        mylist.addLast(20);
        mylist.addLast(30);
        mylist.addLast(40);
       // mylist.traversal();
        for (int i : mylist.toArray()) {
            System.out.println(i);
        }
        //mylist.traversal();
    }

}
