import java.util.Collections;
import java.util.LinkedList;

public class LinkedlistDemo2 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add('X');
        l.add('Y');
        l.add('Z');
        l.add('A');
        l.add('B');
        l.add('C');
        //System.out.println(l);

        LinkedList new1 = new LinkedList();
        new1.addAll(l);
        System.out.println(new1);

        new1.removeAll(l);
        System.out.println(new1);

        //sort

        Collections.sort(l);
        System.out.println(l);

        // Reverse

        Collections.reverse(l);
        System.out.println(l);

        // shuffel

        Collections.shuffle(l);
        System.out.println(l);
    }
}
