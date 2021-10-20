import java.util.*;
import java.util.Collection;

public class Exercise03 {

    public static void main(String[] args) {

        var list = new ArrayList();
        
        for(int i=2; i<=10; i++) {
            list.add(i);
        }
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