import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArraylistDemo2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");

        ArrayList al_d = new ArrayList();
        al_d.addAll(al);
        System.out.println(al_d);

        al_d.removeAll(al);
        System.out.println(al_d);

        System.out.println(al);

        // sort

        Collections.sort(al);
        System.out.println(al);

        // Reverse

        Collections.reverse(al);
        System.out.println(al);

        // shuffel
        Collections.shuffle(al);
        System.out.println(al);
    }
}
