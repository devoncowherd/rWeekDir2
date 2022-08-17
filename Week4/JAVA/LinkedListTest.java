import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String [] args){
        LinkedList linkedList = new LinkedList();
        linkedList.add("Karen");
        linkedList.add("Steve");
        linkedList.add("Charlie");

        System.out.println(linkedList);

        linkedList.addFirst("First");
        linkedList.addLast("Last");

        System.out.println(linkedList);
    
        linkedList.removeLast(); 
        linkedList.removeFirst();

        System.out.println(linkedList);

        linkedList.add("Charlie");
        linkedList.add("Karen");

        System.out.println(linkedList);

        linkedList.removeLastOccurrence("Karen");
        linkedList.removeFirstOccurrence("Steve");
        System.out.println(linkedList);
        //below doesn't work = must manually reverse
        //System.out.println(linkedList.reverse());
    

    }
}
