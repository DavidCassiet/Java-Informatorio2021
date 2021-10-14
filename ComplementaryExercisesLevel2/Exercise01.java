import java.util.*;

public class Exercise01 {

    public static void main(String[] args) {

        ArrayList<String>citys = new ArrayList<String>();

        citys.add("Resistencia");
        citys.add("Córdoba");
        citys.add("Bariloche");
        int count = 0;

        for (String city : citys) {
            count++;
            System.out.println("#" + count + " - " + city);
        }
        
    }
    
}
