import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistcoDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add("Welcome");
        al.add(15.6);
        al.add('A');
        al.add(true);

        System.out.println(al);

        //remove
        al.remove(3);
        System.out.println(al);

        //insert
        al.add(3,"Selenium");
        System.out.println(al);

        // reterving value
        al.get(4);
        System.out.println(al.get(4));
        al.set(4,"X");
        System.out.println(al);
        // contains
        System.out.println(al.contains("Selenium"));
        System.out.println(al.contains("Java"));

        // is empty
        System.out.println(al.isEmpty());

        // reading elements by using loop
        //for loop
        /*for (int i = 0;i<al.size();i++){
            System.out.println(al.get(i));
        }

        //for each loop
        for (Object e:al){
            System.out.println(e);
        }
*/
        // Iterator Method
        Iterator it = al.iterator();
        while (it.hasNext());
        {
            System.out.println(it.next());
        }
    }
}
