import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistDemo1 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(50);
        l.add("Welcome");
        l.add(24.5);
        l.add(true);
        l.add('A');
        System.out.println(l);

        System.out.println(l.size());

        //remove
        l.remove(3);
        System.out.println(l);

        // Insert/adding in the middle of the Array

       l.add(3,"Java");
        System.out.println(l);

        //retriving Value

        System.out.println(l.get(4));

        // Change the Value

        l.set(4,'X');
        System.out.println(l);

        // contains

        System.out.println(l.contains("Java"));

        // is empty
        System.out.println(l.isEmpty());

        //reading elements using loop

        for (int i = 0;i<l.size();i++){
            System.out.println(l.get(i));
        }

        for (Object e:l){
            System.out.println(e);
        }
        // Iterator Method

        Iterator it = l.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
