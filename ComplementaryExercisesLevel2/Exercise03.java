import java.util.*;
import java.util.Collection;

public class Exercise03 {

    public static void main(String[] args) {

        var list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add("J");
        list.add("Q");
        list.add("K");
        list.add("A");

        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        
    }
}