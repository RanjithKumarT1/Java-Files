import java.util.LinkedList;

public class LinkedlistDemo3 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("dog");
        l.add("Horse");
        l.add("Elephant");
        l.add("Cat");
        l.add("dog");
        System.out.println(l);

        l.addFirst("Tiger");
        l.addLast("Monkey");
        System.out.println(l);

        System.out.println(l.getFirst());
        System.out.println(l.getLast());

        System.out.println(l.removeFirst());
        System.out.println(l.removeLast());
        System.out.println(l);
    }
}
